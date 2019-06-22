package pl.sda.bibliotekaonline.infrastructure.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.sda.bibliotekaonline.infrastructure.entity.User;
import pl.sda.bibliotekaonline.infrastructure.repository.UserRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by A.Wójcik on 16 06 2019.
 */
@Service
@RequiredArgsConstructor
public class SecurityUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("Username with login " + login + " not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(),
                mapRoles(user));
    }

    private List<GrantedAuthority> mapRoles(User user) {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getUserRole().name());
        List<GrantedAuthority> authorities = new ArrayList<>(Arrays.asList(authority));
        return authorities;
    }
}
