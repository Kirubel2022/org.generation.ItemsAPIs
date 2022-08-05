package Configuration;
import Service.UserService;
import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.UserRepository;

@Configuration
public class UserConfig {

    @Autowired
    private UserService userService;
    @Bean
    public CommandLineRunner users(UserRepository userRepository){
        return (args -> {
            userRepository.save(new User("Kirubel"));
            userRepository.save(new User("Fikru"));
            userRepository.save(new User("Alex"));
            userRepository.save(new User("Bililign"));
            System.out.println(userRepository.count());

        };
    }
}