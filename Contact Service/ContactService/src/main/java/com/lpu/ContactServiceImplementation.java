package com.lpu;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImplementation implements ContactService {
    
	List<Contact> list=List.of(
			new Contact(201L, "nilesh@gmail.com", "Nilesh",101L),
			new Contact(202L, "raghav@gamil.com", "Raghav",102L),
			new Contact(203L, "pratik@gmail.com", "Partik",103L),
			new Contact(204L, "magar@gmail.com", "Magar",104L)
			
			);

	public List<Contact> getContactofUser(Long id) {
		return list.stream().filter(contact->contact.getUserId().equals(id)).collect(Collectors.toList());
	}
}