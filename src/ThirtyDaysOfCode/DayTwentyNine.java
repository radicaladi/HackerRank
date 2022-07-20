package ThirtyDaysOfCode;

//TODO:
//Given set S={1,2,3.....,N}. Find two integers, A and B (where A<B), from set S, such that the value of A & B
// is the maximum possible and also less than a given integer, K.
// In this case, & represents the bitwise AND operator.

public class DayTwentyNine {
    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int max = 0;
        for(int i = 1; i <N; i++) {
            for (int j = i+1; j <= N; j++) {
                int result = i & j;
                if(result > max && result < K) {
                    max = result;
                }
            }
        }
        return max;
    }
}
