package pl.sda.bibliotekaonline.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.bibliotekaonline.infrastructure.dto.BookDto;
import pl.sda.bibliotekaonline.infrastructure.entity.Book;
import pl.sda.bibliotekaonline.infrastructure.repository.BookRepository;


import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Service
@RequiredArgsConstructor
public class BookFinder {

    private final BookRepository bookRepository;

    public List<BookDto> findByCategory(String category){
        return bookRepository.findByCategory(category).stream().map(Book::toDto).collect(Collectors.toList());

    }


    public BookDto findById(Long id) {
        return bookRepository.findById(id)
                .map(Book::toDto)
                .orElseThrow(()-> new IllegalStateException("Nie istnieje taka książka"));
    }
}
