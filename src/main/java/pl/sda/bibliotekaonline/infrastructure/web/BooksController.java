package pl.sda.bibliotekaonline.infrastructure.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping("/get/{category}")
    ModelAndView getBooks(@PathVariable String category){
        ModelAndView modelAndView = new ModelAndView("books.html");
        modelAndView.addObject("category", category);
        modelAndView.addObject("books", bookFinder.findByCategory(category));
        return modelAndView;
    }

    @GetMapping("/create")
    ModelAndView createBookView() {
        ModelAndView modelAndView = new ModelAndView("createBook.html");
        modelAndView.addObject("book", new BookDto());
        return modelAndView;
    }
    @PostMapping("/create")
    String createBook(BookDto book){
        bookService.create(book);
        return "redirect:/";
    }




}
