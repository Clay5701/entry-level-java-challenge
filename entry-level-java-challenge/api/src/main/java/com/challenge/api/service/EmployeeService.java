package com.challenge.api.service;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;

/**
 * Service layer interface for managing employee data
 */
public interface EmployeeService {
    /**
     * Returns a list of all employees
     *
     * @return a list of all employees
     */
    List<Employee> getAllEmployees();

    /**
     * Returns a specific employee based on their UUID
     *
     * @param uuid the unique ID of the employee
     * @return the employee with the specified ID or null if not found
     */
    Employee getEmployeeByUuid(UUID uuid);

    /**
     * Creates a new employee record and adds it to the employee list
     *
     * @param e the employee added to the list
     * @return the newly recorded employee with a generated UUID
     */
    Employee createEmployee(Employee e);
}
