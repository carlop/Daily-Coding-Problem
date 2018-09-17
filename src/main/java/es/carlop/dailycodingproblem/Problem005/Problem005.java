package es.carlop.dailycodingproblem.Problem005;

/**
 * @author Carlos López [yo@carlop.es]
 */
public class Problem005 {

    public static Pair cons(int a, int b) {
        return new Pair(a, b);
    }

    public static int car(Pair pair) {
        return pair.getA();
    }

    public static int cdr(Pair pair) {
        return pair.getB();
    }

}