package org.zlasu.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter implements Converter<String, Category> {

    @Autowired
    CategoryService categoryService;

    @Override
    public Category convert(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        return categoryService.findOne(Long.parseLong(s));
    }
}
