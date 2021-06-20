package com.SpringMongo.api.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringMongo.api.Model.Book;

public interface Bookservice extends MongoRepository<Book, Integer>{

}
