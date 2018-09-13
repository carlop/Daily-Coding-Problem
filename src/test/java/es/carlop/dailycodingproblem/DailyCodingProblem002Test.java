package es.carlop.dailycodingproblem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.carlop.dailycodingproblem.Problem002.Problem002;

/**
 * Unit tests for each Daily Coding Problem
 */
@DisplayName("Problem 002")
public class DailyCodingProblem002Test {

    int[] numberListOne = {1, 2, 3, 4, 5};
    int[] resultListOne = {120, 60, 40, 30, 24};

    int[] numberListTwo = {3, 2, 1};
    int[] resultListTwo = {2, 3, 6};

    @Test
    @DisplayName("Test examples")
    public void testExamples() {
        // Given examples
        assertArrayEquals(resultListOne, Problem002.productOfAllElements(numberListOne));
        assertArrayEquals(resultListTwo, Problem002.productOfAllElements(numberListTwo));
    }
}