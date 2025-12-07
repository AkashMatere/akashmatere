package com.telusko.simplesebApp.controller;

import com.telusko.simplesebApp.model.Product;
import com.telusko.simplesebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {


@Autowired
    ProductService service;

@GetMapping("/product")

    public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping ("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId){
    return service.getProductById(prodId);

    }
    @PostMapping("/product")
    public void addProduct(@RequestBody List < Product> products ){
        System.out.println(products);
        service.addProduct(products);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        System.out.println("in here is update");
        service.updateProduct(prod);
    }
@DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
    System.out.println("item not here");

    service.deleteProduct(prodId);
    }

            }

