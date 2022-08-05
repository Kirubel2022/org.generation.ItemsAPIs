package controller;

import com.example.org.generation.ItemsAPI.repository.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PostController {
    @GetMapping("/post")
    public Post getpost(){
        Post post=new Post("102","Liked","No","Romantic","Well Described","03/07/2020");
        return post;
    }
}
