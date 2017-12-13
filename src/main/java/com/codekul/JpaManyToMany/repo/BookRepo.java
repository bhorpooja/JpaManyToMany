package com.codekul.JpaManyToMany.repo;

import com.codekul.JpaManyToMany.model.Book;
import com.codekul.JpaManyToMany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by pooja on 4/12/17.
 */
public interface BookRepo extends JpaRepository<Book,Integer>{

    Book findByBookName(String bookName);
}
