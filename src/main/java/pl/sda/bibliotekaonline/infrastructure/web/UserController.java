package pl.sda.bibliotekaonline.infrastructure.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.bibliotekaonline.domain.UserService;

/**
 * Created by A.Wójcik on 22.06.2019.
 */

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

   /* @GetMapping("/get/{login}")
    ModelAndView getUsers(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("books.html");
        modelAndView.addObject("category", category);
        modelAndView.addObject("books", bookFinder.findByCategory(category));
        return modelAndView;
    }*/
/*

    @GetMapping("/create")
    ModelAndView createBookView() {
        ModelAndView modelAndView = new ModelAndView("createBook.html");
        modelAndView.addObject("book", new BookDto());
        return modelAndView;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    String createBook(@ModelAttribute BookDto book) {
        bookService.createOrUpdate(book);
        return "redirect:/";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/delete")
    String deleteBook(@RequestParam Long id) {
        bookService.delete(id);

        return "redirect:/";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/edit")
    ModelAndView editBook(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView("createBook.html");
        modelAndView.addObject("book", bookFinder.findById(id));
        return modelAndView;
    }*/
}
