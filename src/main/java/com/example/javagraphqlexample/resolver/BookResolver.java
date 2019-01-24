package com.example.javagraphqlexample.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.javagraphqlexample.model.Author;
import com.example.javagraphqlexample.model.Book;
import com.example.javagraphqlexample.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getId());
    }
}
