package org.zlasu.article;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zlasu.category.Category;
import org.zlasu.category.CategoryDao;

import java.util.List;

@Service
@Transactional
public class ArticleService {

    private final ArticleDao articleDao;
    private final CategoryDao categoryDao;

    @Autowired
    public ArticleService(ArticleDao articleDao, CategoryDao categoryDao) {
        this.articleDao = articleDao;
        this.categoryDao = categoryDao;
    }


    public void save(Article article) {
        articleDao.save(article);
    }

    public void update(Article article) {
        articleDao.update(article);
    }

    public Article findOne(Long id) {
        return articleDao.findOne(id);
    }

    public void delete(Long id) {
        articleDao.delete(id);
    }

    public List<Article> findAll() {
        return articleDao.findAll();
    }

    public Object findRecent() {
        return articleDao.findRecent();
    }

    public List<Article> findAllByCategoryId(Long categoryId) {
        Category category = categoryDao.findById(categoryId);
        Hibernate.initialize(category.getArticles());

        return category.getArticles();
    }
}

