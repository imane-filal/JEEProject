package fstt.lsi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fstt.lsi.Entitie.Categorie;


@Repository
@EnableMongoRepositories
public interface CategorieRepository extends MongoRepository<Categorie,String> {

}
