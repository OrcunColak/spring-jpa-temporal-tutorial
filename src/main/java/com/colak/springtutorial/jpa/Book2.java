package com.colak.springtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "books")

@NoArgsConstructor
@Getter
@Setter
public class Book2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publication_date", nullable = false)
    private LocalDate publicationDate;

    @Column(name = "created_at", nullable = false)
    private LocalTime createdAt;

    public Book2(String title, String author, LocalDate publicationDate, LocalTime createdAt) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.createdAt = createdAt;
    }
}
