package ru.kirill.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kirill.springboot.models.Post;
import ru.kirill.springboot.repo.PostRepository;





@RestController
public class Maincontroller {

    @Autowired
    private PostRepository postRepository;


    @GetMapping("/")
    public String hello(Model model) {
    Iterable<Post> posIterable = postRepository.findAll();
    model.addAttribute("posts", posIterable);   
        return "hello";
    }
    
}
