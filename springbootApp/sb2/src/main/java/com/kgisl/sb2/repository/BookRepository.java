package com.kgisl.sb2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.sb2.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
}