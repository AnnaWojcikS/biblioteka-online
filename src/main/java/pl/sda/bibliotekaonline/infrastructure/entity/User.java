package pl.sda.bibliotekaonline.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.sda.bibliotekaonline.infrastructure.dto.UserDto;
import pl.sda.bibliotekaonline.infrastructure.type.UserRole;

import javax.persistence.*;

/**
 * Created by A.Wójcik on 16 06 2019.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, length = 32)
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    public UserDto toDto(){
        return UserDto.builder()
                .id(id)
                .login(login)
                .password(password)
                .userRole(userRole)
                .build();
    }
}
