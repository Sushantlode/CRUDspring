package com.jpa.example.Spring.data.example.Service;

import com.jpa.example.Spring.data.example.Repository.ProductRepository;
import com.jpa.example.Spring.data.example.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
     product product;
    @Autowired
     ProductRepository productRepository;
//    public Optional<product> getProductById(int id) {
//        return productRepository.findById(id);
//
//    }
public product getProductById(int id) {
    Optional<product> optionalProduct = productRepository.findById(id);
    return optionalProduct.orElse(null);
}

public List<product> getProducts(){
        return productRepository.findAll();
    }

    public product createProduct(@RequestBody product newProduct){
        return productRepository.save(newProduct);
    }

    public product updateProduct(@PathVariable int id, @RequestBody product updateProduct){
    Optional <product> optional=productRepository.findById(id);
        if(optional.isPresent()){
            product newproduct= optional.get();
            updateProduct.setId(id);
            productRepository.save(updateProduct);
            product.setName(updateProduct.getName());
            product.setCost(updateProduct.getCost());
            product.setType(updateProduct.getType());
            return productRepository.save(product);

        }
        return product=productRepository.save(updateProduct);
    }

    public String deleteProduct(int id){
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return "deleted!!!!";
        }
        return "Product not found";

    }
}

