package com.example.assignment_team.core.services;

import com.example.assignment_team.core.model.Record;
import com.example.assignment_team.core.model.Team;

import java.util.List;

public interface EmployeeService {

    void addEmployeeRecords(List<Record> records);

    List<Team> findAllTeamsWithOverlap();
}
