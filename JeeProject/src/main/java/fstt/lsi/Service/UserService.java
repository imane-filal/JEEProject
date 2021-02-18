package fstt.lsi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fstt.lsi.Entitie.User;
import fstt.lsi.Repository.UserRepository;

@Service
public class UserService {
    private static UserRepository userRepository;
    @Autowired
    public UserService( UserRepository userRepository) {
    	UserService.userRepository = userRepository;
    }


    public User saveUser(User user) {

        return userRepository.save(user);

    }

    public static User fetchUserByUsername(String username) {

        return userRepository.findByUsername(username);

    }

    public static User fetchUserByUsernameAndPassword(String username, String password) {

        return userRepository.findByUsernameAndPassword(username, password);

    }



}