package org.zlasu.author;

import lombok.Getter;
import lombok.Setter;
import org.zlasu.article.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "author")
    private List<Article> articles = new ArrayList<>();
}
