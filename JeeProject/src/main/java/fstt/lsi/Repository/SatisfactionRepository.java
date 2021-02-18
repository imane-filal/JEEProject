package fstt.lsi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fstt.lsi.Entitie.Satisfaction;

@RepositoryRestResource
public interface SatisfactionRepository extends MongoRepository<Satisfaction, String>{

}
