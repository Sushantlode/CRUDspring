package com.jpa.example.Spring.data.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Entity

public class product {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    @Setter
    @Getter
    private String name;
    private long cost;
    @Setter
    @Getter
    private String type;


    public int getCost() {
        return (int) cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
