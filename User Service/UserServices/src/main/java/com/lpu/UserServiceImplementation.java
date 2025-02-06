package com.lpu;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    
    private List<User> list = List.of(
        new User(101L, "Nilesh", "9999999"),
        new User(102L, "Raghav", "9999999"),
        new User(103L, "Pratik", "9999999"),
        new User(104L, "Magar", "9999999")
    );

    @Override
    public User getUserById(Long id) {
        return list.stream().filter(user -> user.getUsrId().equals(id)).findAny().orElse(null);
    }
}