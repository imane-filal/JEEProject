package fstt.lsi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fstt.lsi.Entitie.User;
import fstt.lsi.Service.UserService;

@RestController
public class UserController {

       @Autowired
        UserService userService;

        @PostMapping("/registerUser")
        public User registerUser(@RequestBody User user) throws Exception {
            String Username = user.getUsername();
            String Password = user.getPassword();
            double poids = user.getPoids();
            double langueur = user.getLangueur();
            if (Username != null && !"".equals(Username)) {
            	User userObj = userService.fetchUserByUsername(Username);
                if (userObj != null) {
                    throw new Exception("User with this Username " + Username + " is Already exist  ");
                }
            }
            if (Password != null && Password.length() < 8)  {
                throw new Exception("The password must contain at least 8 characters, Please try again");
            }
            User userObject = null;
            userObject =userService.saveUser(user);
            return userObject;

        }

        @PostMapping("/LoginUser")
        public User loginUser(@RequestBody User user) throws Exception {
            // checking if the user with email,password is present in our db

            String usern = user.getUsername();
            String pwd = user.getPassword();
            User userObject = null;
            if (usern != null && usern != null) {

                userObject = UserService.fetchUserByUsernameAndPassword(usern, pwd);

            }
            if(userObject==null) { //if the user does not exist throw exception

                throw new Exception(" Bad credentials.Please enter a valid username & password. ");
            }

            return userObject;

        }
    }


