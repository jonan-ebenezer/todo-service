package com.ebenezer.todo.controller;

import com.ebenezer.todo.model.Todo;
import com.ebenezer.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("addTodo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);

    }

    @GetMapping("getTodos")
    public List<Todo> getTodos(){
        return todoService.getTodos();

    }

}
