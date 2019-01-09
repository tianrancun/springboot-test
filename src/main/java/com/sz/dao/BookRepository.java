package com.sz.dao;

import com.sz.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author vn0ow6b
 * @Title: BookRepository
 * @Description: TODO
 * @date 2019/1/2 16:05
 */
public interface BookRepository extends ElasticsearchRepository<Book, String> {


    List<Book> findByTitle(String title);
//    List<Book> findByNameAndPrice(String name, Integer price);
//
//    List<Book> findByNameOrPrice(String name, Integer price);
//
//    Page<Book> findByName(String name, Pageable page);
//
//    Page<Book> findByNameNot(String name,Pageable page);
//
//    Page<Book> findByPriceBetween(int price,Pageable page);
//
//    Page<Book> findByNameLike(String name,Pageable page);
//
    @Query("{\"bool\" : {\"must\" : {\"term\" : {\"message\" : \"?0\"}}}}")
    Page<Book> findByMessage(String message, Pageable pageable);
}