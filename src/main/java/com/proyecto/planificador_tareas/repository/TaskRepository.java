package com.proyecto.planificador_tareas.repository;

import com.proyecto.planificador_tareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}