package com.Aravind.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aravind.entity.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findByTeamMemberId(Long teamMemberId);

}
