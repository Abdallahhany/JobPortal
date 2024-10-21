package org.example.jobportal.repository;

import org.example.jobportal.entity.JobPostActivity;
import org.example.jobportal.entity.JobSeekerApply;
import org.example.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {
    // Custom query to find all applications by user id
    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    // Custom query to find all applications by job id
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
