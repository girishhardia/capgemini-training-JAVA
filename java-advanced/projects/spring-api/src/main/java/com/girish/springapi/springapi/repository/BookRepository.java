package com.girish.springapi.springapi.repository;

import com.girish.springapi.springapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
