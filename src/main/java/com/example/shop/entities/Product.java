package com.example.shop.entities;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String img;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getImg(){
        return img;
    }
    public void setImg(String img){
        this.img = img;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
