package com.jpa.example.Spring.data.example.Repository;

import com.jpa.example.Spring.data.example.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product,Integer> {

}
