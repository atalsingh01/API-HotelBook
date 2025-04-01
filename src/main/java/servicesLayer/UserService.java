package servicesLayer;

import org.springframework.stereotype.Service;

import models.User;
import repositoryLayer.UserRepository;

import java.util.List;

@Service
public class UserService  {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

  
    public User createUser(User user) {
        return userRepository.save(user);
    }
}

