package pl.sda.bibliotekaonline.infrastructure.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Controller
public class MainViewController {

    @RequestMapping
    ModelAndView mainView() {
        ModelAndView mav = new ModelAndView("index.html");
        mav.addObject("todayDate", LocalDate.now());
        return mav;
    }
}
