package Service;

import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class UserServiceMySQL implements UserService
{
    private UserRepository userRepository;
    @Autowired
    private UserRepository repository;
    @Override
    public User addUser(User user) {return repository.save(user);}
    @Override
    public Optional<User>getUser(int userId) {return repository.findById(userId);}
    @Autowired
    public void UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<User> getUsers() {return userrepository.findAll();}

    @Autowired
    private RequestService service;
    private User updatedUser;
    @PostConstruct
public void initUser(){
    repository.saveAll(Stream.of(new User(userId:101, firstName:"John",lastName:"David",email:"john.dave@gmail.com",
            password:"123",place:"America",phone:"2403894598",age:25,gender:"Male",work:"Accountant", lifEvents:"Happy"),
    new User(userId:102, firstName:"Daniel",lastName:"Fikru",email:"Daniel.dave@gmail.com",
            password:"124",place:"America",phone:"2404894598",age:30,gender:"Male",work:"Accountant",
            lifEvents:"Happy")).collect(Collectors.toList()))
}
public List<User> getUsers(){
        service.sendRequest();
    return repository.findAll();
}
    public UserController(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public Iterable<User> getAllPlants() {
        return this.userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getPlantById(@PathVariable("id") Integer id) {
        return this.userRepository.findById(id);
    }

    @PostMapping("/plants")
    public User createNewUser(@RequestBody User user) {
        User newUser = this.userRepository.save(user);
        return newUser;
    }

    @PutMapping("/user/{id}")
    public User updateUser(
            @PathVariable("id") Integer id,
            @RequestBody User u
    ) {
        Optional<User> userToUpdateOptional = this.userRepository.findById(id);
        if (!userToUpdateOptional.isPresent()) {
            return null;
        }
        User userToUpdate = userToUpdateOptional.get();
        if (u.getHasId() != null) {
            userToUpdate.setHasId(u.getHasId());
        }
        if (u.getEmail() != null) {
            userToUpdate.setEmail(u.getEmail());
        }
        if (u.getName() != null) {
            userToUpdate.setName(u.getName());
        }
        if (u.getRequest() != null) {
            userToUpdate.setRequest(u.getRequest());
        }
        User updateUser = this.userRepository.save(userToUpdate);
        return updatedUser;
    }
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable("id") Integer id) {
        Optional<User> userToDeleteOptional = this.userRepository.findById(id);
        if (!userToDeleteOptional.isPresent()) {
            return null;
        }
        User userToDelete = userToDeleteOptional.get();
        this.userRepository.delete(userToDelete);
        return userToDelete;
    }
    public long count(){
        return userRepository.count();
    }

}
