package org.example.jobportal.entity;

// Interface representing the structure of a recruiter's job details
public interface IRecruiterJobs {
    Long getTotalCandidates();

    int getJob_post_id();

    String getJob_title();

    int getLocationId();

    String getCity();

    String getState();

    String getCountry();

    int getCompanyId();

    String getName();
}
