package com.manish.ecom_proj_1.controller;

import com.manish.ecom_proj_1.model.Product;
import com.manish.ecom_proj_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
}
