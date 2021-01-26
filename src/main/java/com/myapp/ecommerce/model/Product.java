package com.myapp.ecommerce.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Invalid name")
    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;


    public Product() {

    }

    public Product(String name, Double price, String pictureUrl) {
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }

    public Product(Long id, @NotNull(message = "Invalid name") String name, Double price, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pictureUrl = pictureUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        return String.format("Id = %d, Name = '%s', Price = %.2f, Picture URL = '%s'.", id, name, price, pictureUrl);
    }
}