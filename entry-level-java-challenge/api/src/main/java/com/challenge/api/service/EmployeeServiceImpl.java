package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeModel;
import java.time.Instant;
import java.util.*;
import org.springframework.stereotype.Service;

/**
 * Implementation of EmployeeService
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    /**
     * Data structure for storing mock employee data
     * Hashmap chosen for fast O(1) average look-up time (Useful for retrieving employee by UUID)
     *  */
    private final Map<UUID, Employee> mockEmployeeDatabase = new HashMap<>();

    /**
     * Constructor to initialize the service with some mock data
     *  */
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

        EmployeeModel e2 = new EmployeeModel();
        e2.setUuid(UUID.randomUUID());
        e2.setFirstName("James");
        e2.setLastName("Doe");
        e2.setFullName("James Doe");
        e2.setSalary(87000);
        e2.setAge(37);
        e2.setJobTitle("Software Engineer");
        e2.setEmail("james.doe@example.com");
        e2.setContractHireDate(Instant.now());
        mockEmployeeDatabase.put(e2.getUuid(), e2);

        EmployeeModel e3 = new EmployeeModel();
        e3.setUuid(UUID.randomUUID());
        e3.setFirstName("Jessica");
        e3.setLastName("Jones");
        e3.setFullName("Jessica Jones");
        e3.setSalary(88000);
        e3.setAge(38);
        e3.setJobTitle("Software Engineer");
        e3.setEmail("jessica.jones@example.com");
        e3.setContractHireDate(Instant.now());
        mockEmployeeDatabase.put(e3.getUuid(), e3);
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
