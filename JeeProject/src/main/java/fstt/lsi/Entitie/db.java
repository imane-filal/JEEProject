package fstt.lsi.Entitie;


import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fstt.lsi.Repository.UserRepository;

@Component

public class db implements CommandLineRunner {

	
	
	@Autowired
	private UserRepository userRepository;
	
	public db(UserRepository userRepository) {
		this.userRepository  = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		                   	                             
		User user = new User(
				"user1",
				"12345678",
				1.2,
				60
				);
		this.userRepository.deleteAll();
	    this.userRepository.save(user);
		
		



	}
	

}

