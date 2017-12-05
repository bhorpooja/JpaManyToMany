package com.codekul.JpaManyToMany.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by pooja on 4/12/17.
 */

@Entity
public class Student {

    @Id
    Integer id;
    String name;
    String dept;


    @ManyToMany(mappedBy = "students")
    Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
