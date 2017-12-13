package com.codekul.JpaManyToMany.controller;

import com.codekul.JpaManyToMany.model.Book;
import com.codekul.JpaManyToMany.model.Student;
import com.codekul.JpaManyToMany.repo.BookRepo;
import com.codekul.JpaManyToMany.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
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

    @GetMapping("/getStudents/{bookName}")
    public Book getStudents(@PathVariable String bookName){
        Book books=bookRepo.findByBookName(bookName);
        return books;
    }

    @GetMapping("/getBooks/{id}")
    public Student getBooks(@PathVariable Integer id){
        Student student=studentRepo.findById(id);
        return student;
    }

    @GetMapping("/updateBook/{id}/{bookName}")
    public String updateBook(@PathVariable Integer id,@PathVariable String bookName){
        Integer flag=0;
        Student student=studentRepo.findOne(id);
        Set<Book> books1 = student.getBooks();
//        HashSet<Book> books = new HashSet<Book>(books1);


       // HashSet<Book> books=(HashSet<Book>) student.getBooks();
        Iterator itr=books1.iterator();
//       Iterator it= books.iterator();
        while (itr.hasNext()){

            Book book=(Book) itr.next();
            String name= book.getBookName();
            if (name.equalsIgnoreCase(bookName)) {
                books1.remove(book);
                flag=1;
            }
        }
        if(flag==1){
            return "Book removed";
        }
        else {
            return "book not exist";
        }

    }


}
