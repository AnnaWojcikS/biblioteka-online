package pl.sda.bibliotekaonline.infrastructure.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.bibliotekaonline.domain.UserService;
import pl.sda.bibliotekaonline.infrastructure.dto.UserDto;
import pl.sda.bibliotekaonline.infrastructure.dto.UserRoleDto;
import pl.sda.bibliotekaonline.infrastructure.type.UserRole;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by A.Wójcik on 22.06.2019.
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class SignUpController {

    private final UserService userService;

    @GetMapping("/signup")
    ModelAndView signUpView() {
        ModelAndView modelAndView = new ModelAndView("signUpPage.html");
        modelAndView.addObject("user", new UserDto());
        modelAndView.addObject("userRoles", Arrays.stream(UserRole.values())
                .map(role -> new UserRoleDto(role, role.getLabel())).collect(Collectors.toList()));
        return modelAndView;

    }
    @PostMapping("/signup")
    String signUpPage(@ModelAttribute UserDto user) {
        userService.createOrUpdate(user);
        return "redirect:/";
    }
}
