package ma.enset.tp_cassandra_bddc.web;

import ma.enset.tp_cassandra_bddc.entities.User;
import ma.enset.tp_cassandra_bddc.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;


@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping("/user")
    public List<User> findAll (){
        if (userService.getAllUsers().isEmpty()){
            return Collections.emptyList();

        }
        else {
            return userService.getAllUsers();
        }
    }
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

        return userService.addUser(user);

    }
    @DeleteMapping("/user/{id}")
    public String DeleteUser(@PathVariable UUID id){
        return userService.DeleteUser(id);
    }
    @GetMapping("/user/{id}")
    public User findById(@PathVariable UUID id){
        return userService.findUserById(id);
    }
    @PutMapping("/user/{id}")
    public String UpdateUser(@PathVariable UUID id,@RequestBody User user){
        return userService.UpdateUser(id,user);

    }




}