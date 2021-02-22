package com.example.demo.controllers;

import com.example.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class FormExample {
    // Showing how to create a form using thymeleaf
    @GetMapping(value = "/submit")
    public String renderForm() {
        return "form";
    }
    @PostMapping("/submit-post")
    @ResponseBody
    public String addPost(@RequestParam("title") String title,@RequestParam("content") String content){
        return title + "\n" + content;
        // Post post = new Post();
        //posts.add(posts.add.title)


    }



    //Skal være dashboard

    @GetMapping(value="/list")
    @ResponseBody
    public ArrayList renderList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("orange");

        // This list gets returned as json!
        return list;
    }
}
