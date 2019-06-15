package pl.sda.bibliotekaonline.infrastructure.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String title;
    @Column
    private String author;

    @OneToMany
    private Set<BookStatus> statuses;





}
