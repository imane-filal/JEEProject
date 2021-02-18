package fstt.lsi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import fstt.lsi.Entitie.User;

@Repository
@EnableMongoRepositories
public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByUsername(String username);

	public User findByUsernameAndPassword(String username, String password);
}
