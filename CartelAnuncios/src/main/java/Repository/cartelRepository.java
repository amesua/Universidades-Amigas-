package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.Cartel;

public interface cartelRepository extends MongoRepository<Cartel, String> {

}
