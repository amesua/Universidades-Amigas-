package poli.edu.co.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import poli.edu.co.Model.Cartel;

public interface cartelRepository extends MongoRepository<Cartel, String> {

}
