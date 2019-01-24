package com.example.javagraphqlexample.repository;

import com.example.javagraphqlexample.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
