package tech.ops.tracker.cruddemo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.ops.tracker.cruddemo.entity.project;
@Repository
public interface projectRepo extends JpaRepository<project, UUID> {
	
//	 @Query("select a from project a where a.project_id = ?1")
//	    public project findproject(String product_id);
}
