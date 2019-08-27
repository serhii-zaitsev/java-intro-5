package lesson03.a_inheritanve.Fibonacci;

public class Fibonacci {

    private static void printFibonacciNumbers (int n)
        {
            if (n < 0)
                {
                    System.out.println("Please enter a positive number more than 0");
                }
            else if (n == 0)
                {
                    System.out.println("Please enter a positive number more than 0");
                }
            else
                {
                    int t1 = 0, t2 = 1;
                    System.out.print("Fibonacci " + n + " : ");
                    for (int i = 1; i <= n; i++)
                    {
                        System.out.print(t1 + " ");
                        int sum = t1 + t2;
                        t1 = t2;
                        t2 = sum;
                    }
                    System.out.println();
                }
        }

    public static void main(String[] args) {

        printFibonacciNumbers(20);
        printFibonacciNumbers(-5);
        printFibonacciNumbers(0);
        printFibonacciNumbers(1);
    }
}
