package org.example.firstjobapp.company.Repository;

import org.example.firstjobapp.company.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository <Company, Long> {
}
