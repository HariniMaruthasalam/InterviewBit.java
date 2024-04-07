public class Solution {
    public int solve(int A) {
        int originalNumber = A;
        int numberOfDigits = countDigits(A);
        int sum = 0;

        while (A > 0) {
            int digit = A % 10;
            sum += Math.pow(digit, numberOfDigits);
            A = A / 10;
        }

        return originalNumber == sum ? 1 : 0;
    }

    private int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
}
