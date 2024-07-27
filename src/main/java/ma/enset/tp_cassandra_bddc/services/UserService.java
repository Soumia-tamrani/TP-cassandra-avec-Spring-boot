package ma.enset.tp_cassandra_bddc.services;

import ma.enset.tp_cassandra_bddc.entities.User;
import ma.enset.tp_cassandra_bddc.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@AllArgsConstructor

public class UserService {
    private UserRepository userRepositorie;
    public User addUser(User user){
        user.setId(UUID.randomUUID());
        return  userRepositorie.insert(user);


    }
    public List<User> getAllUsers(){
        return userRepositorie.findAll();
    }
    public String DeleteUser(UUID id){
        User user = userRepositorie.findById(id).orElseThrow();
        userRepositorie.delete(user);
        return "user deleted successfully ";
    }
    public User findUserById (UUID id){
        return userRepositorie.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }
    public String UpdateUser(UUID id,User user){
        User userId=userRepositorie.findById(id).orElseThrow();
        if(user.getEmail()!=null){
            userId.setEmail(user.getEmail());
        }
        if (user.getName()!=null){
            userId.setName(user.getName());
        }
        if (user.getAge()!= 0){
            userId.setAge(user.getAge());
        }
        userRepositorie.save(userId);
        return "user updated successffuly";

    }



}