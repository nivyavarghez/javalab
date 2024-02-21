import java.io.*;

class Fact {
    public static void main(String args[]) {
        DataInputStream val = new DataInputStream(System.in);
        String name;
        int num;

        try {
            System.out.println("Enter Your name:");
            name = val.readLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("Enter your num to find the factorial:");
            num = Integer.parseInt(val.readLine());

            long factorial = calculateFactorial(num);

            System.out.println("Factorial of " + num + " is " + factorial);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Recursive method to calculate factorial
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
