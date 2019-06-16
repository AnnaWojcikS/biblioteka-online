package pl.sda.bibliotekaonline.infrastructure.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by A.Wójcik on 16 06 2019.
 */
@Controller
public class LoginController {
    @GetMapping("/login")
    ModelAndView loginPage(@RequestParam(required = false) String error) {
        ModelAndView modelAndView = new ModelAndView("loginPage.html");
        modelAndView.addObject("error", error);
        return modelAndView;
    }
}
