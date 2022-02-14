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

import Model.UserDetails;
import RepositoryDemo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {
	 @Autowired
	    private UserRepository userRepository;
	 
	 @GetMapping("/add")
	 public List<UserDetails> getAllUser() 
	 {
	        return userRepository.findAll();
	 }
	 @PostMapping("/save")
	 public List<UserDetails>saveUser(@RequestBody UserDetails userDetails)
	 {
		return userRepository.findAll();
		 
	 }
	 @PutMapping("/update")
	 public UserDetails updateUser(@RequestBody UserDetails userDetails)
	 {
		return userRepository.save(userDetails);	 
	 }
	 @DeleteMapping("/delete")
	 public String deleteUser(@RequestBody UserDetails userDetails)
	 {
		 userRepository.delete(userDetails);
		return "Deleted Succifully"+userDetails;
		 
	 }
	
}
