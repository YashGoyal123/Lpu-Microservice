package com.lpu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	RestTemplate rt;
	@Autowired
	UserServiceImplementation us;
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		User user = this.us.getUserById(id);
		List contacts = (List<User>) this.rt.getForObject("http://ContactService:9092/contact/user/"+user.getUsrId(),List.class);
		user.setContacts(contacts);
		return user;
	}
}