package com.example.MovieCatalogservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MovieCatalogResource {

     @RequestMapping("/")
    public String getCatalog(){

         return "Welcome to Docker....";
    }
}
