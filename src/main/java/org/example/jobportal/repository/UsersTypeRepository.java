package org.example.jobportal.repository;

import org.example.jobportal.entity.Users;
import org.example.jobportal.entity.UsersType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {
}
