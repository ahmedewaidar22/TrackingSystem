package tech.ops.tracker.cruddemo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.ops.tracker.cruddemo.entity.user;

public interface userRepo extends JpaRepository<user, UUID> {

}
