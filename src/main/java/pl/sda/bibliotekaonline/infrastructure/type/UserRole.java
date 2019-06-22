package pl.sda.bibliotekaonline.infrastructure.type;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by A.Wójcik on 22.06.2019.
 */
public enum UserRole {
    USER("Użytkownik"),
    ADMIN("Administrator");

    @Getter
    @Setter
    String label;

    UserRole(String label) {
        this.label = label;
    }
}
