package org.example.jobportal.repository;

import org.example.jobportal.entity.JobSeekerProfile;
import org.example.jobportal.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
