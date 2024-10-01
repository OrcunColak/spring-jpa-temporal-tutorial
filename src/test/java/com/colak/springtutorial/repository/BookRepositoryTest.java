package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // This annotation is used for JPA tests
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;


    @Test
    void testFindAllBooks() {
        // Retrieve all books
        var books = bookRepository.findAll();

        // Assertions
        assertThat(books).hasSize(5);
        assertThat(books).extracting(Book::getTitle).containsAnyOf("To Kill a Mockingbird", "The Great Gatsby");
    }

}

