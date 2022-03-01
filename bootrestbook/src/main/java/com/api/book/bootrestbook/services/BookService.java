package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import com.api.book.bootrestbook.models.Book;

import org.springframework.stereotype.Component;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();
    static {
        list.add(new Book(12, "Javac", "XYZ"));
        list.add(new Book(13, "C", "GFF"));
        list.add(new Book(14, "Pyt", "TGG"));
        list.add(new Book(16, ".net", "LMN"));

    }

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBookById(int id) {
        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;

    }
}
