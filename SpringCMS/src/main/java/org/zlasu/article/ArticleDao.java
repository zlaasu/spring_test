package org.zlasu.article;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ArticleDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Article article) {
        entityManager.persist(article);
    }

    public void update(Article article) {
        entityManager.merge(article);
    }

    public Article findOne(Long id) {
        return entityManager.find(Article.class, id);
    }

    public void delete(Long id) {
        Article article = findOne(id);
        if (article != null) {
            entityManager.remove(article);
        }
    }

    public List<Article> findAll() {
        Query query = entityManager.createQuery("SELECT a FROM Article a");

        return query.getResultList();
    }

    public Object findRecent() {
        Query query = entityManager.createQuery("SELECT a FROM Article a ");
        query.setMaxResults(5);

        return query.getResultList();
    }

    public Object findAllByCategoryId(Long categoryId) {
        Query query =
                entityManager.createQuery("SELECT a FROM Article a LEFT JOIN Category c WHERE c.id = :categoryId");
        query.setParameter("categoryId", categoryId);

        return query.getResultList();
    }
}
