package Service;

import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    public User addUser(User user);
    public Optional<User>getUser(int userId);
    public List<User>getUsers();
}
