package com.example.demo.service;

import java.io.IOException;

import com.example.demo.Page;
import com.example.demo.model.Product;


public interface ProductService {
	Product findById(String id) throws IOException;

    Page<Product> search(String query) throws IOException;

    Page<Product> next(Page page) throws IOException;

    void save(Product product) throws IOException;
}
