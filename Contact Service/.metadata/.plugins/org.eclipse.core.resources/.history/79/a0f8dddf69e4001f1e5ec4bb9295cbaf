package com.lpu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {
	@Autowired
		ContactServiceImplementation cs;
		@GetMapping("/user/{id}")
		public List<Contact>getContact(@PathVariable Long id) {
			return this.cs.getContactofUser(id);
		}
	}