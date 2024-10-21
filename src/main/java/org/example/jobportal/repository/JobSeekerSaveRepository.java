package org.example.jobportal.repository;

import org.example.jobportal.entity.JobPostActivity;
import org.example.jobportal.entity.JobSeekerProfile;
import org.example.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerSaveRepository  extends JpaRepository<JobSeekerSave, Integer> {

    // find all saved jobs by user
    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountIf);

    // find all saved jobs by job
    List <JobSeekerSave> findByJob(JobPostActivity job);
}
