package org.example.firstjobapp.job;

import org.example.firstjobapp.job.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
