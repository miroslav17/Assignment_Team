package com.example.assignment_team.core.writer;

public interface Writer {

    void write(String output);

    void writeLine(String output);

    void writeLine(String format, Object... params);

}