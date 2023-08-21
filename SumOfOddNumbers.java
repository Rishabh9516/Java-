
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 45; // The upper limit
        int sum = sumOfOddNumbers(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    public static int sumOfOddNumbers(int n) {
        int total = 0;
        for (int i = 1; i <= n; i += 2) {
            total += i;
        }
        return total;
    }
}

