 package com.java.violations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.violations.model.Violations;

public interface ViolationsRepository extends JpaRepository<Violations,Long>{

}
