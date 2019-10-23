package org.zlasu.customer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Primary
@Getter
@Setter
public class FileCustomerLogger implements CustomerLogger {

    private String fileName;

    @Override
    public void log() {
        System.out.println(LocalDateTime.now() + " :File: " + fileName);
    }
}
