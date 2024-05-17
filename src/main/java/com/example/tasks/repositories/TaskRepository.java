package com.example.tasks.repositories;

import com.example.tasks.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findTaskById(Long id);

    void deleteById(Long id);
}
