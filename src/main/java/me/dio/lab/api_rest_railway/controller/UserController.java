package me.dio.lab.api_rest_railway.controller;

import jakarta.validation.Valid;
import me.dio.lab.api_rest_railway.controller.DTOs.UserCreateDTO;
import me.dio.lab.api_rest_railway.domain.model.User;
import me.dio.lab.api_rest_railway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody @Valid UserCreateDTO userToCreate){
        var createdUser = userService.create(new User(userToCreate.name(), userToCreate.account(), userToCreate.card(), userToCreate.features(), userToCreate.news()));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdUser.getId())
                .toUri();

        return ResponseEntity.created(location).body(createdUser);
    }
}
