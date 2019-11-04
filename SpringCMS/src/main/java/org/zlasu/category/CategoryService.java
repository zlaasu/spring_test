package org.zlasu.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private final CategoryDao categoryDao;

    @Autowired
    public CategoryService(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Transactional
    public void save(Category category) {
        categoryDao.save(category);
    }

    public void update(Category category) {
        categoryDao.update(category);
    }

    public Category findOne(Long id) {
        return categoryDao.findOne(id);
    }

    public void delete(Long id) {
        categoryDao.delete(id);
    }

    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}
