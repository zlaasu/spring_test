package org.zlasu.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorServiceDao {

    private final AuthorDao authorDao;

    @Autowired
    public AuthorServiceDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public void save(Author author) {
        authorDao.save(author);
    }

    public void update(Author author) {
        authorDao.update(author);
    }

    public Author findOne(Long id) {
        return authorDao.findOne(id);
    }

    public void delete(Long id) {
        authorDao.delete(id);
    }

    public List<Author> findAll() {
        return authorDao.findAll();
    }
}

