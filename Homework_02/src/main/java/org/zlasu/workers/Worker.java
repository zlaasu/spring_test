package org.zlasu.workers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker {

    private int id;
    private String name;

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
