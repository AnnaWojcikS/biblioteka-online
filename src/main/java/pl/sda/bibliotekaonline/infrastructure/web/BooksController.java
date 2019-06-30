package pl.sda.bibliotekaonline.infrastructure.web;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.bibliotekaonline.domain.BookFinder;
import pl.sda.bibliotekaonline.domain.BookService;
import pl.sda.bibliotekaonline.infrastructure.dto.BookDto;

/**
 * Created by A.Wójcik on 15 06 2019.
 */

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
class BooksController {

    private final BookFinder bookFinder;
    private final BookService bookService;

    @GetMapping("/get/category/{category}")
    ModelAndView getBooks(@PathVariable String category) {
        ModelAndView modelAndView = new ModelAndView("books.html");
        modelAndView.addObject("category", category);
        modelAndView.addObject("books", bookFinder.findByCategory(category));
        return modelAndView;
    }
    @GetMapping("/get/title/{title}")
    ModelAndView getBooksByTitle(@PathVariable String title) {
        ModelAndView modelAndView = new ModelAndView("books.html");
        modelAndView.addObject("title", title);
        modelAndView.addObject("books", bookFinder.findByTitle(title));
        return modelAndView;
    }

    @PreAuthorize("hasRole('ADMIN')")
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
    }

}
