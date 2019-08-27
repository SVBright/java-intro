package lesson03;

public class Fibonacci {
    public static void main(String[] args){
        //Set your values here:
        int n = 0;
        if (n < 0 || n ==0)
            System.out.println("Please enter a positive number more than 0");
        else if (n == 1)
            System.out.println("0");
        else printFibonacciNumbers(n);
    }

    private static void printFibonacciNumbers(int n){
        // int printMe = str.length();
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(f[i]+" ");
        }
    }
}
