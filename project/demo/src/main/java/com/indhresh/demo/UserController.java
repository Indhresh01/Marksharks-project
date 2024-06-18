package com.indhresh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserData> getUserById(@PathVariable Long id){
        Optional<UserData> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{register}")
    public ResponseEntity<UserData> createUser(@RequestBody UserData userData, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // Handle validation errors, return bad request response or custom error messages
            return ResponseEntity.badRequest().build();
        }

        UserData createdUser = userService.createUser(userData);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserData> updateUser(@PathVariable Long id, @RequestBody UserData userDetails) {
        UserData updatedUser = userService.updateUser(id, userDetails);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/fetch")
    public ResponseEntity<Object> getAllUsers() {
        List<UserData> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }


}
