package pl.sda.bibliotekaonline.infrastructure.dto;

import lombok.*;
import pl.sda.bibliotekaonline.infrastructure.type.UserRole;

/**
 * Created by A.Wójcik on 22.06.2019.
 */

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String login;
    private String password;
    private UserRole userRole;
}
