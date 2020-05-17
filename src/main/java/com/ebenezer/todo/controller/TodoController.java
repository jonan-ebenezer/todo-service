package com.ebenezer.todo.controller;

import com.ebenezer.todo.configuration.ApplicationProperties;
import com.ebenezer.todo.model.Todo;
import com.ebenezer.todo.service.TodoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @Autowired
    ApplicationProperties properties;

    @PostMapping("addTodo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);

    }

    @GetMapping("getTodos")
    @HystrixCommand(fallbackMethod = "getTodosFallbackMethod")
    public List<Todo> getTodos() {
        return todoService.getTodos();

    }

    @PutMapping("updateTodo")
    public void updateTodo(@RequestBody Todo todo) {
        todoService.updateTodo(todo);

    }

    @DeleteMapping("deleteTodo")
    public void deleteTodo(@RequestBody Todo todo) {
        todoService.deleteTodo(todo);
    }

    @GetMapping
    public String getEnvironmentVariables() {
        return properties.getEnvironment().getProperty("test1.db");

    }

    public List<Todo> getTodosFallbackMethod() {
        List<Todo> todos =  new ArrayList<>();
        return todos;

    }

}
