package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.entities.ToDo;


public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
