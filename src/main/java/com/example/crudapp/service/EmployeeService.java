package com.example.crudapp.service;

import com.example.crudapp.model.Employee;
import com.example.crudapp.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee update(Long id, Employee updated) {
        Employee existing = employeeRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(updated.getName());
            existing.setEmail(updated.getEmail());
            existing.setDepartment(updated.getDepartment());
            existing.setSalary(updated.getSalary());
            return employeeRepository.save(existing);
        }

        return null;
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}