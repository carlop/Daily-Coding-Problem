package es.carlop.dailycodingproblem.Problem004;

import java.util.Arrays;

/**
 * @author Carlos López [yo@carlop.es]
 */

public class Problem004 {
    public static int firstMissingPositiveInteger(int[] integers) {
        int count = Integer.MIN_VALUE;
        boolean firstPositive = false;

        Arrays.sort(integers);

        for (int i = 0; i < integers.length; i++) {
            if ((integers[i] > 0) && (!firstPositive)) {
                count = 1;
                firstPositive = true;
            }

            if ((i > 0) && (count != integers[i])) {
                return count;
            }

            count++;
        }
        return count;
    }
}
