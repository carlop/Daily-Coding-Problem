package es.carlop.dailycodingproblem;

import es.carlop.dailycodingproblem.Problem004.Problem004;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Problem 004")
public class DailyCodingProblem004Test {
    @Test
    @DisplayName("First Positive Integer")
    public void firstPositiveIntegerTest() {
        assertEquals(2, Problem004.firstMissingPositiveInteger(new int[] {3, 4, -1, 1}));
        assertEquals(3, Problem004.firstMissingPositiveInteger(new int[] {1, 2, 0}));
    }
}