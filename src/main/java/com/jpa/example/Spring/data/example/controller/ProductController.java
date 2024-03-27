package com.jpa.example.Spring.data.example.controller;

import com.jpa.example.Spring.data.example.Repository.ProductRepository;
import com.jpa.example.Spring.data.example.Service.ProductService;
import com.jpa.example.Spring.data.example.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import java.util.List;
@RequestMapping("/products")
@RestController
public class ProductController {



    @Autowired
    ProductService productService;
    @Autowired
    private product product;

    @GetMapping("/{id}")
    public product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("")
    public List<product> getProducts(){
        return productService.getProducts();
    }

    @PostMapping("")
    public product createProduct(@RequestBody product newProduct){
        return productService.createProduct(newProduct);
    }

    @PutMapping("/{id}")
    public product updateProduct(@PathVariable int id,@RequestBody product updateProduct){
        return productService.updateProduct(id,updateProduct);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

}

