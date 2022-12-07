package com.example.assignment_team.core;


import com.example.assignment_team.core.repository.EmployeeRepository;
import com.example.assignment_team.core.repository.EmployeeRepositoryImpl;
import com.example.assignment_team.core.services.EmployeeService;
import com.example.assignment_team.core.services.EmployeeServiceImpl;
import com.example.assignment_team.core.writer.FileIO;
import com.example.assignment_team.core.writer.FileIOImpl;
import com.example.assignment_team.core.writer.OutputWriter;
import com.example.assignment_team.core.writer.Writer;

public class TeamLongestPeriodMain {
    public static void main(String[] args) {

        FileIO fileIO = new FileIOImpl();
        Writer writer = new OutputWriter();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmployeeService emplService = new EmployeeServiceImpl(employeeRepository);

        Engine engine = new Engine(fileIO, writer, emplService);
        engine.run();
    }
}
