package org.zlasu.category;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CategoryDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Category category) {
        entityManager.persist(category);
    }

    public void update(Category category) {
        entityManager.merge(category);
    }

    public Category findOne(Long id) {
        return entityManager.find(Category.class, id);
    }

    public void delete(Long id) {
        Category category = findOne(id);
        if (category != null) {
            entityManager.remove(category);
        }
    }

    public List<Category> findAll() {
        Query query = entityManager.createQuery("SELECT c FROM Category c");

        return query.getResultList();
    }

    public Category findById(Long categoryId) {
        Query query =
                entityManager.createQuery("SELECT c FROM Category c WHERE c.id = :categoryId");
        query.setParameter("categoryId", categoryId);

        return (Category) query.getSingleResult();
    }
}
