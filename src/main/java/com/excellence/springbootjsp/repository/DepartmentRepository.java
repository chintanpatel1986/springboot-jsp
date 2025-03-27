package com.excellence.springbootjsp.repository;

import com.excellence.springbootjsp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}