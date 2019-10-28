package org.zlasu.category;

import lombok.Getter;
import lombok.Setter;
import org.zlasu.article.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="categorys")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=100, nullable = false)
    private String name;

    private String description;

    @ManyToMany(mappedBy = "categorys")
    private List<Article> articles  = new ArrayList<>();
}
