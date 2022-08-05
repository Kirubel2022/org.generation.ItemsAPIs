package controller;

import Service.CommentService;
import Service.PostService;
import Service.RequestService;
import Service.UserService;
import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

    @RestController
    @RequestMapping("/users")
    public class userController {
         User user;
        @Autowired
        private UserService userService;
        @Autowired
        private PostService postService;
        @Autowired
        private CommentService commentService;
        @Autowired
        private RequestService requestService;

        @GetMapping("/{UserId}")
        public User getuser(Integer userId){
            return user;
        }

        @PostMapping("/save")
        public ResponseEntity<User> addUser(@RequestBody User user) {
            return ResponseEntity.ok(userService.addUser(user));
        }

        @GetMapping("/users")
        public ResponseEntity<List<User>> getUsers() {
            List<User> users = userService.getUsers();
            users.forEach(System.out::println);
            return new ResponseEntity<>(users, HttpStatus.OK);
        }

        @GetMapping("/users/{userId}")
        public ResponseEntity<User> getUser(@PathVariable("userid") int userId) {
            Optional<User> userOptional = userService.getUser(userId);
            return userOptional.map(user
                            -> new ResponseEntity<>(user, HttpStatus.OK))
                    .orElseGet(()
                            -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }

        @PutMapping("/users/{id}")               // update existing user
        public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
                                               @RequestBody User userDetails) throws IllegalCallerException {
            User user = userService.getUser(userId).orElseThrow(() ->
                    new IllegalCallerException("User not found for this id :: " + userId));
            user.setName(userDetails.getName());
            final User updatedUser = userService.save(user);
            return ResponseEntity.ok(updatedUser);
        }
        @DeleteMapping("/users/delete/{UserId}")
        public Integer deleteUser(Integer userId){
            this.user=null;
            return "userId deleted Successfuly";
        }

        }


