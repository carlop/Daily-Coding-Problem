package es.carlop.dailycodingproblem;

import es.carlop.dailycodingproblem.Problem001.Problem001;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for each Daily Coding Problem
 */
@DisplayName("Problem 001")
public class DailyCodingProblem001Test {

    int[] exampleOne = new int[] {10, 15, 3, 7};
    int[] exampleTwo = new int[] {9, 14, 5, 4};
    int kOne = 17;
    int kTwo = 19;

    @Test
    @DisplayName("True example")
    public void testTrue() {
        // Given example
        assertTrue(Problem001.addUpToK(exampleOne, kOne));

        // Another example
        assertTrue(Problem001.addUpToK(exampleTwo, kTwo));
    }

    @Test
    @DisplayName("False example")
    public void testFalse() {
        // Given example
        assertFalse(Problem001.addUpToK(exampleOne, kTwo));

        // Another example
        assertFalse(Problem001.addUpToK(exampleTwo, kOne));
    }
}
