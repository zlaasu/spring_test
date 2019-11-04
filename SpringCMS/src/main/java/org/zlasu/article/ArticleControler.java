package org.zlasu.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.zlasu.author.Author;
import org.zlasu.author.AuthorService;
import org.zlasu.category.Category;
import org.zlasu.category.CategoryService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleControler {

    private final ArticleService articleService;
    private final CategoryService categoryService;
    private final AuthorService authorService;

    @Autowired
    public ArticleControler(ArticleService articleService, CategoryService categoryService, AuthorService authorService) {
        this.articleService = articleService;
        this.categoryService = categoryService;
        this.authorService = authorService;
    }

    @GetMapping("/list")
    public String categoryListAction(Model model) {
        model.addAttribute("articles", articleService.findAll());

        return "/article/list";
    }

    @GetMapping("/add")
    public String categoryAddAction(Model model) {
        model.addAttribute("article", new Article());

        return "/article/edit";
    }

    @PostMapping("/add")
    public String categoryAddPostAction(@Valid Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "/article/edit";
        }

        articleService.save(article);

        return "redirect:/article/list";
    }

    @GetMapping("/edit/{id}")
    public String categoryEditAction(@PathVariable Long id, Model model) {
        model.addAttribute("article", articleService.findOne(id));

        return "/article/edit";
    }

    @PostMapping("/edit/{id}")
    public String categoryEditPostAction(@Valid Article article, @PathVariable Long id, BindingResult result) {
        if (result.hasErrors()) {
            return "/article/edit";
        }

        articleService.update(article);

        return "redirect:/article/list";
    }

    @GetMapping("/delete/{id}")
    public String categoryDeleteAction(@PathVariable Long id) {
        articleService.delete(id);

        return "redirect:/article/list";
    }

    @GetMapping("/list/{categoryId}")
    public String listAction(Model model, @PathVariable Long categoryId) {
        model.addAttribute("articles", articleService.findAllByCategoryId(categoryId));

        return "article/list";
    }

    @GetMapping("/recent")
    public String recentAction(Model model) {
        model.addAttribute("articles", articleService.findRecent());

        categoryService.findAll().forEach(s -> System.out.println(s));

        model.addAttribute("categorys", categoryService.findAll());

        return "article/listRecent";
    }

    @ModelAttribute(name = "authors")
    public List<Author> getAuthors() {
        return authorService.findAll();
    }

    @ModelAttribute(name = "categories")
    public List<Category> getCategories() {
        return categoryService.findAll();
    }
}
