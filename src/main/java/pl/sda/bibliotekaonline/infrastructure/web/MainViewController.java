package pl.sda.bibliotekaonline.infrastructure.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Controller
public class MainViewController {

    @GetMapping
    String mainView() {
        return "index.html";
    }
}
