package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Book2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // This annotation is used for JPA tests
public class BookRepository2Test {

    @Autowired
    private BookRepository2 repository;


    @Test
    void testFindAllBooks() {
        // Retrieve all books
        List<Book2> list = repository.findAll();

        // Assertions
        assertThat(list).hasSize(5);
        assertThat(list).extracting(Book2::getTitle).containsAnyOf("To Kill a Mockingbird", "The Great Gatsby");
    }

}

