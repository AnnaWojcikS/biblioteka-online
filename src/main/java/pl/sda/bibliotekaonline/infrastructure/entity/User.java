package pl.sda.bibliotekaonline.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<UserRole> roles;
}
