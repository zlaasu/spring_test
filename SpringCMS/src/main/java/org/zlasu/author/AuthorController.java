package org.zlasu.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/list")
    public String categoryListAction(Model model) {
        model.addAttribute("authors", authorService.findAll());

        return "/author/list";
    }

    @GetMapping("/add")
    public String categoryAddAction(Model model) {
        model.addAttribute("author", new Author());

        return "/author/edit";
    }

    @PostMapping("/add")
    public String categoryAddPostAction(@Valid Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "/author/edit";
        }

        authorService.save(author);

        return "redirect:/author/list";
    }

    @GetMapping("/edit/{id}")
    public String categoryEditAction(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.findOne(id));

        return "/author/edit";
    }

    @PostMapping("/edit/{id}")
    public String categoryEditPostAction(@Valid Author author, BindingResult result, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "/author/edit";
        }

        authorService.update(author);

        return "redirect:/author/list";
    }

    @GetMapping("/delete/{id}")
    public String categoryDeleteAction(@PathVariable Long id) {
        authorService.delete(id);

        return "redirect:/author/list";
    }
}
