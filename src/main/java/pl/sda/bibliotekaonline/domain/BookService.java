package pl.sda.bibliotekaonline.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.bibliotekaonline.infrastructure.dto.BookDto;
import pl.sda.bibliotekaonline.infrastructure.entity.Book;
import pl.sda.bibliotekaonline.infrastructure.repository.BookRepository;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void createOrUpdate(BookDto dto){
        Book book = Book.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .author(dto.getAuthor())
                .category(dto.getCategory())
                .build();
        bookRepository.save(book);
    }

    public void delete(Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
