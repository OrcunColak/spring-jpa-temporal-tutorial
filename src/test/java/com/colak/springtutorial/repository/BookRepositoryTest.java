package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // This annotation is used for JPA tests
public class BookRepositoryTest {

    @Autowired
    private BookRepository repository;


    @Test
    void testFindAllBooks() {
        // Retrieve all books
        List<Book> list = repository.findAll();

        // Assertions
        assertThat(list).hasSize(5);
        assertThat(list).extracting(Book::getTitle).containsAnyOf("To Kill a Mockingbird", "The Great Gatsby");
    }

}

