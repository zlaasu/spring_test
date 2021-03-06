package org.zlasu.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void save(Author author) {
        authorRepository.save(author);
    }

    public void update(Author author) {
        authorRepository.save(author);
    }

    public Author findOne(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}

