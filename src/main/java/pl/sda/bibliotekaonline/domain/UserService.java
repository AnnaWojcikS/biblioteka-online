package pl.sda.bibliotekaonline.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.bibliotekaonline.infrastructure.dto.UserDto;
import pl.sda.bibliotekaonline.infrastructure.entity.User;
import pl.sda.bibliotekaonline.infrastructure.repository.UserRepository;

/**
 * Created by A.Wójcik on 22.06.2019.
 */

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void createOrUpdate(UserDto dto) {
        User user = User.builder()
                .id(dto.getId())
                .login(dto.getLogin())
                .password(passwordEncoder.encode(dto.getPassword()))
                .userRole(dto.getUserRole())
                .build();
        userRepository.save(user);

    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}
