package es.carlop.dailycodingproblem;

import es.carlop.dailycodingproblem.Problem001.Problem001;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for each Daily Coding Problem
 */
public class DailyCodingProblemTest {

    @Test
    @DisplayName("Problem 001")
    public void Problem001Test() {
        // Given example: numberList = {10, 15, 3, 7), k = 17
        assertTrue(Problem001.addUpToK(new int[] {10, 15, 3, 7}, 17));
        assertFalse(Problem001.addUpToK(new int[] {10, 15, 3, 7}, 11));

        // Another example: numberList = {11, 14, 5, 4), k = 19
        assertTrue(Problem001.addUpToK(new int[] {11, 14, 5, 4}, 19));
        assertFalse(Problem001.addUpToK(new int[] {11, 14, 5, 4}, 20));
    }
}
