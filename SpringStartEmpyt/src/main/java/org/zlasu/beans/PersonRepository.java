package org.zlasu.beans;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PersonRepository {

    public List<String> findAll() {
        List<String> list = Arrays.asList("jan", "john", "arek");

        return list;
    }
}
