package org.zlasu.category;

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
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public String categoryListAction(Model model) {
        model.addAttribute("categories", categoryService.findAll());

        return "/category/list";
    }

    @GetMapping("/add")
    public String categoryAddAction(Model model) {
        model.addAttribute("category", new Category());

        return "/category/edit";
    }

    @PostMapping("/add")
    public String categoryAddPostAction(@Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "/category/edit";
        }

        categoryService.save(category);

        return "redirect:/category/list";
    }

    @GetMapping("/edit/{id}")
    public String categoryEditAction(@PathVariable Long id, Model model) {
        model.addAttribute("category", categoryService.findOne(id));

        return "/category/edit";
    }

    @PostMapping("/edit/{id}")
    public String categoryEditPostAction(@Valid Category category, @PathVariable Long id, BindingResult result) {
        if (result.hasErrors()) {
            return "/category/edit";
        }

        categoryService.update(category);

        return "redirect:/category/list";
    }

    @GetMapping("/delete/{id}")
    public String categoryDeleteAction(@PathVariable Long id) {
        categoryService.delete(id);

        return "redirect:/category/list";
    }
}
