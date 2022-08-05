package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;
import repository.RequestRepository;

@Service
public class RequestService {
    public void sendRequest(){
        System.out.println("Request service is working!!");
    }
    @Autowired
    private RequestRepository requestRepository;
}
