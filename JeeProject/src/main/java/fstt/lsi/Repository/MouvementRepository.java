package fstt.lsi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fstt.lsi.Entitie.Mouvement;

@RepositoryRestResource
public interface MouvementRepository extends MongoRepository<Mouvement, String> {

}
