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

    private final ArticleRepository articleRepository;
    private final CategoryDao categoryDao;

    @Autowired
    public ArticleService( ArticleRepository articleRepository, CategoryDao categoryDao) {
        this.articleRepository = articleRepository;
        this.categoryDao = categoryDao;
    }


    public void save(Article article) {
        articleRepository.save(article);
    }

    public void update(Article article) {
        articleRepository.save(article);
    }

    public Article findOne(Long id) {
        Article article =  articleRepository.findById(id).orElse(null);
        Hibernate.initialize(article.getCategorys());

        return article;
    }

    public void delete(Long id) {
        articleRepository.deleteById(id);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public Object findRecent() {
        return articleRepository.findFirst5ByOrderByCreatedDesc();
    }

    public List<Article> findAllByCategoryId(Long categoryId) {
        Category category = categoryDao.findById(categoryId);
        Hibernate.initialize(category.getArticles());

        return category.getArticles();
    }
}

