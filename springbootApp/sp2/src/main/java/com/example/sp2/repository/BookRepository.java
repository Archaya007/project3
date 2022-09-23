package com.example.sp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sp2.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
 