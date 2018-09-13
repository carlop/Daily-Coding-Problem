package es.carlop.dailycodingproblem.Problem002;

/**
 * @author Carlos López [yo@carlop.es]
 */

public class Problem002 {
    public static int[] productOfAllElements(int[] numberList) {
        int[] result = new int[numberList.length];

        for (int i = 0; i < numberList.length; i++) {
            int product = 1;
            for (int t : numberList) {
                if (numberList[i] != t) {
                    product *= t;
                }
            } 
            result[i] = product;
        }

        return result;
    }
}