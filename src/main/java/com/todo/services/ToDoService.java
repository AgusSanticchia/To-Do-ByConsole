package com.todo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.entities.ToDo;
import com.todo.repository.ToDoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> getToDoById(Long id) {
        return toDoRepository.findById(id);
    }

    public ToDo createToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }    

    public ToDo updateToDo(Long id, ToDo toDo) {
        toDo.setId(id);
        return toDoRepository.save(toDo);
    }
    public void deleteToDo(Long id) {
        toDoRepository.deleteById(id);
    }
}