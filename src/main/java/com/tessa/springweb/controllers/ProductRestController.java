package com.tessa.springweb.controllers;


import com.tessa.springweb.entities.Production;
import com.tessa.springweb.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/products/",method = RequestMethod.GET)
    public List<Production> getProducts(){
        return repository.findAll();
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    public Production getProduct(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/products/",method = RequestMethod.POST)
    public Production createProduct(@RequestBody Production product){
        return repository.save(product);
    }

    @RequestMapping(value = "/products/",method = RequestMethod.PUT)
    public Production updateProduct(@RequestBody Production product){
        return repository.save(product);
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id){
               repository.deleteById(id);
    }
}










