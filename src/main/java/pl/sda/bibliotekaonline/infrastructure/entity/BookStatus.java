package pl.sda.bibliotekaonline.infrastructure.entity;

import javax.persistence.*;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Entity
@Table(name = "book_statuses")
public class BookStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

}
