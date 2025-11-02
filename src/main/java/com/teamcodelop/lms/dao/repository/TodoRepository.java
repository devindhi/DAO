package com.teamcodelop.lms.dao.repository;

import com.teamcodelop.lms.dao.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
