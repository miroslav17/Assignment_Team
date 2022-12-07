package com.example.assignment_team.core.repository;

import com.example.assignment_team.core.model.Record;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository {

    void save(Record record);

    void saveAll(Collection<Record> records);

    List<Record> getAllRecords();
}