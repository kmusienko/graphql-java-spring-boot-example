package com.example.javagraphqlexample.repository;

import com.example.javagraphqlexample.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
