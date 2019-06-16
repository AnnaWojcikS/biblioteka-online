package pl.sda.bibliotekaonline.infrastructure.dto;

import lombok.*;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private String category;
}
