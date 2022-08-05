package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class CommentService {
    public void writeComment(){
        System.out.println("Comment service is working!!");
    }
    @Autowired
    private CommentRepository commentRepository;
}
