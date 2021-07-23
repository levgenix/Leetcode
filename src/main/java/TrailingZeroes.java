public class TrailingZeroes {
    /**
     * https://leetcode.com/problems/factorial-trailing-zeroes/
     * Solution: https://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
     */
    public int trailingZeroes(int n) {
        /*BigInteger f = IntStream.rangeClosed(1, k).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("f: "+f);
        char[] chars = f.toString().toCharArray();
        for (int i = chars.length - 1, c = 0; i >= 0; i--) {
            // System.out.println("i:"+i+" c:"+c);
            if (chars[i] != 48) { // != 0
                return c;
            }
            c++;
        }
        return 0;*/

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    /**
     * https://leetcode.com/problems/preimage-size-of-factorial-zeroes-function/
     */
    public int preimageSizeFactorialZeroesFunction(long k) {
        /**
         * solution in https://www.programmersought.com/article/94534514697/
         *
         * Define upper and lower limits
         * k = zeta(x) = int(x/5) + int(x/25) + ... <= x/5 + x/25 + ... = 4x/5 ，
         * So there is x >= 5K/4 >= K. x <=10*K+1 is a very broad upper bound, in fact this question x <= 5*K+1 is too.
         */
        long low = k, high = 10 * k + 1;
        //Perform binary search
        while (low < high) {
            //Calculate the intermediate index
            long mid = low + (high - low) / 2;
            // The number of 0
            long sum = zeta(mid);
            //Determine whether it is found
            if (k == sum ) {
                return 5;
            } else if (sum < k ) {
                low = mid + 1;//Judgment lower limit
            } else {
                high = mid; //Judgment upper limit
            }
        }
        return 0;
    }

    //Calculate the number of 0
    public long zeta(long x) {
        if (x == 0) return 0;
        return x / 5 + zeta(x / 5);
    }
}
