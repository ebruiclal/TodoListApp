package com.example.todolistapp.controller;

import com.example.todolistapp.model.Todo;
import com.example.todolistapp.model.TodoRepository;
import com.example.todolistapp.model.User;
import com.example.todolistapp.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListAppController {
    @Autowired
    TodoRepository todoRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public Iterable<Todo> todos(){
        return todoRepository.findAll();
    }
    @GetMapping("/users")
    public Iterable<User> users(){
        return userRepository.findAll();
    }
    @PostMapping
    public User AddUser(@RequestBody AddUser user){
        User user = new user(){
            return null;
        }

    }
}
