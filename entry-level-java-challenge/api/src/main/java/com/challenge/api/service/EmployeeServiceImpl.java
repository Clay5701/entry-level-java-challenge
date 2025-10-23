package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeModel;
import java.time.Instant;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<UUID, Employee> mockEmployeeDatabase = new HashMap<>();

    public EmployeeServiceImpl() {
        EmployeeModel e1 = new EmployeeModel();
        e1.setUuid(UUID.randomUUID());
        e1.setFirstName("John");
        e1.setLastName("Smith");
        e1.setFullName("John Smith");
        e1.setSalary(92000);
        e1.setAge(43);
        e1.setJobTitle("Software Engineer");
        e1.setEmail("john.smith@example.com");
        e1.setContractHireDate(Instant.now());
        mockEmployeeDatabase.put(e1.getUuid(), e1);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(mockEmployeeDatabase.values());
    }

    @Override
    public Employee getEmployeeByUuid(UUID uuid) {
        return mockEmployeeDatabase.get(uuid);
    }

    @Override
    public Employee createEmployee(Employee e) {
        EmployeeModel newEmployee = new EmployeeModel();

        newEmployee.setUuid(UUID.randomUUID());
        newEmployee.setFirstName(e.getFirstName());
        newEmployee.setLastName(e.getLastName());
        newEmployee.setFullName(e.getFullName());
        newEmployee.setSalary(e.getSalary());
        newEmployee.setAge(e.getAge());
        newEmployee.setJobTitle(e.getJobTitle());
        newEmployee.setEmail(e.getEmail());
        newEmployee.setContractHireDate(Instant.now());

        mockEmployeeDatabase.put(newEmployee.getUuid(), newEmployee);

        return newEmployee;
    }
}
