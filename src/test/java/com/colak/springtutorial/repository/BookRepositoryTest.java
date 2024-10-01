package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // This annotation is used for JPA tests
public class BookRepositoryTest {

    @Autowired
    private BookRepository repository;


    @Test
    void testFindBookById() {
        // Create a Date directly using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(1960, Calendar.JULY, 11, 0, 0, 0); // Year, Month (0-based), Day
        calendar.set(Calendar.MILLISECOND, 0);
        Date publicationDate = calendar.getTime();

        // Find the book by ID
        Optional<Book> foundBook = repository.findById(1L);

        // Assertions
        assertThat(foundBook).isPresent(); // Ensure the book is found
        assertThat(foundBook.get().getPublicationDate()).isEqualTo(publicationDate); // Check publicationDate
    }

}

