package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

public class EmployeeModel implements Employee {
    // Members
    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    // Getters & Setters

    // uuid getter
    @Override
    public UUID getUuid() {
        return uuid;
    }
    // uuid setter
    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    // firstName getter
    @Override
    public String getFirstName() {
        return firstName;
    }
    // firstName setter
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName getter
    @Override
    public String getLastName() {
        return lastName;
    }
    // lastName setter
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // fullName getter
    @Override
    public String getFullName() {
        return fullName;
    }
    // fullName setter
    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // salary getter
    @Override
    public Integer getSalary() {
        return salary;
    }
    // salary setter
    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // age getter
    @Override
    public Integer getAge() {
        return age;
    }
    // age setter
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    // jobTitle getter
    @Override
    public String getJobTitle() {
        return jobTitle;
    }
    // jobTitle setter
    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // email getter
    @Override
    public String getEmail() {
        return email;
    }
    // email setter
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    // contractHireDate getter
    @Override
    public Instant getContractHireDate() {
        return contractHireDate;
    }
    // contractHireDate setter
    @Override
    public void setContractHireDate(Instant contractHireDate) {
        this.contractHireDate = contractHireDate;
    }

    // contractTerminationDate getter
    @Override
    public Instant getContractTerminationDate() {
        return contractTerminationDate;
    }
    // contractTerminationDate setter
    @Override
    public void setContractTerminationDate(Instant contractTerminationDate) {
        this.contractTerminationDate = contractTerminationDate;
    }
}
