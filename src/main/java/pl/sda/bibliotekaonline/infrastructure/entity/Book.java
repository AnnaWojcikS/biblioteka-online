package pl.sda.bibliotekaonline.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.sda.bibliotekaonline.infrastructure.dto.BookDto;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by A.Wójcik on 15 06 2019.
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String category;

    @OneToMany
    private Set<BookStatus> statuses;

    public BookDto toDto(){
        return BookDto.builder().id(id).title(title).author(author).category(category).build();
    }





}
