package controller;

import com.example.org.generation.ItemsAPI.repository.entity.Comment;
import com.example.org.generation.ItemsAPI.repository.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CommentController {
    @GetMapping("/comments")
    public Comment getpost(){
        Comment comment=new Comment(102,"Encouraging",100,
                "03/06/2021");
        return comment;
    }
}
