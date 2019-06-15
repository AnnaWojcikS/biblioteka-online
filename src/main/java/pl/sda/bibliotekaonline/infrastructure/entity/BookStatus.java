package pl.sda.bibliotekaonline.infrastructure.entity;

import javax.persistence.*;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Entity
@Table(name = "book_status")
public class BookStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String status;

}
