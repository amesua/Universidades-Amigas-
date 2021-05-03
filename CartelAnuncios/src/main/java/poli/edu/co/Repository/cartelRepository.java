package poli.edu.co.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import poli.edu.co.Model.Cartel;

public interface cartelRepository extends MongoRepository<Cartel, String> {
	
	@Query("{ 'nombreEvento' : /.*?0.*/ }")
	List<Cartel> findCartelesQ1(String nombreEvento);
	
	/*@Query(value="{}", fields= "{_id:0, nombreEvento:1, detalleEvento:1}")
	List<Cartel> findCustomersQ2();
	*/

}
