package es.carlop.dailycodingproblem;

import es.carlop.dailycodingproblem.Problem005.Pair;
import es.carlop.dailycodingproblem.Problem005.Problem005;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Problem 005")
public class DailyCodingProblem005Test {

    private int a = 3;
    private int b = 4;

    @Test
    @DisplayName("Create Pair Test")
    public void createPairTest() {
        Pair pair = Problem005.cons(a, b);
        assertEquals(a, pair.getA());
        assertEquals(b, pair.getB());
        assertNotEquals(a, pair.getB());
        assertNotEquals(b, pair.getA());
    }

    @Test
    @DisplayName("Car test")
    public void carTest(){
        assertEquals(a, Problem005.car(Problem005.cons(a, b)));
        assertNotEquals(b, Problem005.car(Problem005.cons(a, b)));
    }

    @Test
    @DisplayName("Cdr test")
    public void cdrTest() {
        assertEquals(b, Problem005.cdr(Problem005.cons(a, b)));
        assertNotEquals(a, Problem005.cdr(Problem005.cons(a, b)));
    }
}