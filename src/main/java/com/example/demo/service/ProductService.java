package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService{

    public List getProducts(){
        return Arrays.asList("Mazda","Toyota","Audi");
    }
}