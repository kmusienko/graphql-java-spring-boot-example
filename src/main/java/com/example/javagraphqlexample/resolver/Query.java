package com.example.javagraphqlexample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.javagraphqlexample.model.Author;
import com.example.javagraphqlexample.model.Book;
import com.example.javagraphqlexample.repository.AuthorRepository;
import com.example.javagraphqlexample.repository.BookRepository;

public class Query implements GraphQLQueryResolver {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}