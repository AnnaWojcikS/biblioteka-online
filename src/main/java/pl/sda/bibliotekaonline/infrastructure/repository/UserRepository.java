package pl.sda.bibliotekaonline.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.bibliotekaonline.infrastructure.entity.User;

/**
 * Created by A.Wójcik on 16 06 2019.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

}
