package org.zlasu.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zlasu.category.CategoryService;

@Controller
@RequestMapping("/article")
public class ArticleControler {

    private final ArticleService articleService;
    private final CategoryService categoryService;

    @Autowired
    public ArticleControler(ArticleService articleService, CategoryService categoryService) {
        this.articleService = articleService;
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public String listAction(Model model) {
        model.addAttribute("articles", articleService.findAll());

        return "article/articleAll";
    }

    @GetMapping("/list/{categoryId}")
    public String listAction(Model model, @PathVariable Long categoryId) {
        model.addAttribute("articles", articleService.findAllByCategoryId(categoryId));

        return "article/articleAll";
    }

    @GetMapping("/recent")
    public String recentAction(Model model) {
        model.addAttribute("articles", articleService.findRecent());

        categoryService.findAll().forEach(s -> System.out.println(s));

        model.addAttribute("categorys", categoryService.findAll());

        return "article/articleRecent";
    }
}
