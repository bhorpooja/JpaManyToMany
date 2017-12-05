package com.codekul.JpaManyToMany.controller;

import com.codekul.JpaManyToMany.model.Book;
import com.codekul.JpaManyToMany.model.Student;
import com.codekul.JpaManyToMany.repo.BookRepo;
import com.codekul.JpaManyToMany.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pooja on 4/12/17.
 */
@RestController
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/insertData")
    public String insertData(@RequestBody Book book){
        bookRepo.save(book);
        return "Data inserted successfully";
    }

}
