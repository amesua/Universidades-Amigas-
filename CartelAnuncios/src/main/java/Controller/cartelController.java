package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Cartel;

@RestController 
@RequestMapping("/api/v1/")
public class cartelController {

	@Autowired
	Repository.cartelRepository cartelRepository;
	
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
	
	
}
