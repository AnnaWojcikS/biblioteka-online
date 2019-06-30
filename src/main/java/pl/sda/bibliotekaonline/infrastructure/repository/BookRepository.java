package pl.sda.bibliotekaonline.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.bibliotekaonline.infrastructure.entity.Book;

import java.util.List;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategory(String searchedCategory);
    List<Book> findByTitle(String searchedTitle);


}
