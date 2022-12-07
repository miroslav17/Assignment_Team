package com.example.assignment_team.core.plant;

import com.example.assignment_team.core.model.Team;

public final class TeamFactory {

    public TeamFactory() {
    }

    public static Team execute(long firstEmployeeId, long secondEmployeeId, long overlapDuration) {
        return new Team(
                firstEmployeeId,
                secondEmployeeId,
                overlapDuration);
    }
}
