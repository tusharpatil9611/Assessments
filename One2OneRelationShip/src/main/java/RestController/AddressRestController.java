package RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Address;
import RepositoryDemo.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressRestController {
	@Autowired
	private AddressRepository addressRepository;
	 @GetMapping("/add")
	 public List<Address>getAllAddress()
	 {
		return addressRepository.findAll();
	 }
	 @PostMapping("/save") // http://localhost:8080/address/save
	    public Address saveUser(@RequestBody Address address)
	 {
	        return addressRepository.save(address);
	 }
	 @PutMapping("/update")
	 public Address updateUser(@RequestBody Address address)
	 {
		return addressRepository.save(address);
		 
	 }
	   @DeleteMapping("/delete") // http://localhost:8080/address/update
	    public String deleteUser(@RequestBody Address address) 
	   {
	        addressRepository.delete(address);
	        return "Deleted Successfully"+address;
	    }
}
