package es.carlop.dailycodingproblem.Problem001;

/**
 * @author Carlos López [yo@carlop.es]
 */

public class Problem001 {
    public static Boolean addUpToK(int[] numberList, int k) {
        if (numberList.length != 0 || k <= 0) {
            for (int i : numberList) {
                for (int j : numberList) {
                    if (i != j) {
                        if ((i + j) == k) {
                            return true;
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Array of numbers is empty or k is equal or less to zero");
        }
        return false;
    }

    /**
     * TODO:
     */
    public static Boolean addUpToKOnePass(int[] numberList, int k) {
        return false;
    }
}
