package com.excellence.springbootjsp.service.implement;

import com.excellence.springbootjsp.model.Department;
import com.excellence.springbootjsp.repository.DepartmentRepository;
import com.excellence.springbootjsp.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Transactional
    @Override
    public List<Department> getAllDepartmentList() {
        return departmentRepository.findAll();
    }

    @Transactional
    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    @Transactional
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
