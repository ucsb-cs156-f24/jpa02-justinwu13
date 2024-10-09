package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    
    @Test
    public void toString_returns_correct_string() {
       assert(team.toString().equals("Team(name=test-team, members=[])"));
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assert(team.equals(team));
    }

    @Test
    public void equals_returns_false_for_diff_class() {
        int x = 1;
        assert(!team.equals(x));
    }

    @Test
    public void equals_returns_true_for_identical_team() {
        Team team2 = new Team("test-team");
        assert(team.equals(team2));
    }

    @Test
    public void equals_returns_false_for_team_with_diff_members() {
        Team team3 = new Team("test-team");
        team3.addMember("Justin");
        assert(!team.equals(team3));
    }

    @Test
    public void equals_returns_false_for_team_with_diff_name() {
        Team team4 = new Team("team-test");
        assert(!team.equals(team4));
    }

    @Test
    public void hashCode_matches_expected_value() {
        int result = team.hashCode();
        int expected = -1226298695;
        assertEquals(result, expected);
    }

}
