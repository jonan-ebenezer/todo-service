package com.ebenezer.todo.service;

import com.ebenezer.todo.model.Todo;
import com.ebenezer.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        todoRepository.save(todo);

    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();

    }

    public void updateTodo(Todo todo){
        todoRepository.save(todo);

    }

    public void deleteTodo(Todo todo) {
        todoRepository.delete(todo);
    }
}
