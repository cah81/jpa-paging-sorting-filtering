package com.example.jpapagingsortingfiltering.repository;

import com.example.jpapagingsortingfiltering.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Long> {
}
