package com.integrationelastic.exercise.repository;

import com.integrationelastic.exercise.entity.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IEmployeeRepository extends ElasticsearchRepository<Employee, Long> {
}
