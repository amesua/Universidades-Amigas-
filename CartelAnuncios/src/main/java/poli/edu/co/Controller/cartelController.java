package poli.edu.co.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poli.edu.co.Model.Cartel;
@CrossOrigin(origins = "http://localhost:4200")
@RestController 
@RequestMapping("/api/v1/")
public class cartelController {

	@Autowired
	poli.edu.co.Repository.cartelRepository cartelRepository;
	
	@GetMapping("/Carteles")
	public List<Cartel> getAllCarteles(){
		return cartelRepository.findAll();
	}
	
	@GetMapping("/Carteles/{id}")
	public Cartel getCustomerByID(@PathVariable String id) {
		return cartelRepository.findById(id).get();
	}
	
	@PostMapping("/Carteles")
	public Cartel saveCustomer(@RequestBody Cartel cartel){
		return cartelRepository.save(cartel);
	}
	
	@PostMapping("/CartelesList")
	public List<Cartel> saveListCustomers(@RequestBody List<Cartel> carteles) {
		return cartelRepository.saveAll(carteles);
	}
	@DeleteMapping("/Carteles/{id}")
	public Cartel deleteCartel(@PathVariable String id) {
		Cartel cartel = cartelRepository.findById(id).get();
		cartelRepository.deleteById(id);
		return cartel;
	}
	//Query
		@GetMapping("/CartelesQ1/{lastname}")
		public List<Cartel> findCarteles1(@PathVariable String nombreEvento){
			return cartelRepository.findCartelesQ1(nombreEvento);
		}

		//Query
		/*@GetMapping("/CustomersQ2")
		public List<Cartel> findCarteles2(){
			return cartelRepository.findCartelesQ2();
		}*/
	
	
}
