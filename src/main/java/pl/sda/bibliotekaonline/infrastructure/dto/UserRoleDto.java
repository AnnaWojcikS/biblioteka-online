package pl.sda.bibliotekaonline.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.sda.bibliotekaonline.infrastructure.type.UserRole;

/**
 * Created by A.Wójcik on 22.06.2019.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserRoleDto {

    private UserRole id;
    private String label;
}
