package com.codekul.JpaManyToMany.repo;

import com.codekul.JpaManyToMany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by pooja on 4/12/17.
 */
public interface StudentRepo extends JpaRepository<Student,Integer>{

    Student findById(Integer id);


}
