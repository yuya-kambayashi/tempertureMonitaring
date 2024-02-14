/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtbasic;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamba
 */
@Named("dtBasicView")
@ViewScoped
public class DtBasicView implements Serializable {

    private List<Product> products;

    //@Inject
    //private ProductService service;

    @PostConstruct
    public void init() {
        //products = service.getProducts(10);
        
        products = new ArrayList<>();
        products.add(new Product(1000, "f230fh0g3", "Bamboo Watch", "Product Description", "bamboo-watch.jpg", 65,
                "Accessories", 24, 5));
        products.add(new Product(1001, "nvklal433", "Black Watch", "Product Description", "black-watch.jpg", 72,
                "Accessories", 61,  4));
        products.add(new Product(1002, "zz21cz3c1", "Blue Band", "Product Description", "blue-band.jpg", 79,
                "Fitness", 2,  3));
        products.add(new Product(1003, "244wgerg2", "Blue T-Shirt", "Product Description", "blue-t-shirt.jpg", 29,
                "Clothing", 25, 5));
    
    }

    public List<Product> getProducts() {
        return products;
    }

//    public void setService(ProductService service) {
//        this.service = service;
//    }
}
