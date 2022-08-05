package Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;
import repository.PostRepository;

@Service
public class PostService {
    public void Post(){
        System.out.println("Post service is working!!");
    }
    @Autowired
    private PostRepository postRepository;
}
