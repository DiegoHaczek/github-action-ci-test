package com.example.github_action_ci_test.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    List<User> getAllUsers() {
        return List.of(
          new User("John Doe", "12345"),
          new User("Peter Parker", "12345"),
          new User("John Smith", "123454")
        );
    }
}
