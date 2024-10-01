package com.colak.springtutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "books")

@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    // If @Temporal is not present JDBC reads it as java.sql.Timestamp
    @Temporal(TemporalType.DATE) // Only the date part (YYYY-MM-DD)
    @Column(name = "publication_date", nullable = false)
    private Date publicationDate;

    @Temporal(TemporalType.TIMESTAMP) // Both date and time
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    public Book(String title, String author, Date publicationDate, Date createdAt) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.createdAt = createdAt;
    }
}
