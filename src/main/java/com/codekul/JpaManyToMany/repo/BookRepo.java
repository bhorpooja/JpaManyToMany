package com.codekul.JpaManyToMany.repo;

import com.codekul.JpaManyToMany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pooja on 4/12/17.
 */
public interface BookRepo extends JpaRepository<Book,Integer>{
}
