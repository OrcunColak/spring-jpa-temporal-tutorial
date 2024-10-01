package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Book2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository2 extends JpaRepository<Book2, Long> {
}
