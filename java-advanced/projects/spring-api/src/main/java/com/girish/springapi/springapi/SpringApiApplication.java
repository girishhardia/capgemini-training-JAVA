package com.girish.springapi.springapi;

import com.girish.springapi.springapi.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringApiApplication.class, args);

        Book book = new Book();
        book.getId();
        book.getAuthor();


    }

}
