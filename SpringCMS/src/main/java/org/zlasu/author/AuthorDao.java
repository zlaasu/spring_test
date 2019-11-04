package org.zlasu.author;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Author author) {
        entityManager.persist(author);
    }

    public void update(Author author) {
        entityManager.merge(author);
    }

    public Author findOne(Long id) {
        return entityManager.find(Author.class, id);
    }

    public void delete(Long id) {
        Author author = findOne(id);
        if (author != null) {
            entityManager.remove(author);
        }
    }

    public List<Author> findAll() {
        Query query = entityManager.createQuery("SELECT a FROM  Author a");

        return query.getResultList();
    }
}
