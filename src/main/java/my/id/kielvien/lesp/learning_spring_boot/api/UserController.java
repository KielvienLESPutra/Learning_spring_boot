package my.id.kielvien.lesp.learning_spring_boot.api;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.id.kielvien.lesp.learning_spring_boot.models.UserModel;
import my.id.kielvien.lesp.learning_spring_boot.service.UserService;

@RequestMapping(value= "/user")
@RestController
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public void postAddUser(@RequestBody UserModel user) {
		userService.addUser(user);
	}

	@PutMapping(path = "{id}")
	public void updateUser(@PathVariable("id") UUID id,@RequestBody UserModel user) {
		userService.updateUser(id, user);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteUser(@PathVariable("id") UUID id) {
		userService.deleteUser(id);
	}

	@GetMapping(path = "{id}")
	public UserModel searchUser(@PathVariable("id") UUID id) {
		return userService.searchUser(id);
	}
	
	@GetMapping
	public List<UserModel> getAllUser() {
		return userService.getAllUser();
	}
}
