//methods without parameter
public class MethodWithoutParameters {

    static void display() {
        System.out.println("Welcome to Java Methods!");
    }

    public static void main(String[] args) {
        display();
    }
}

methods with parameter
  public class MethodWithParameters {

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Devipriya");
    }
}

//return method
public class ReturnMethod {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);

        System.out.println("Sum = " + sum);
    }
}

//recursion
import java.util.Scanner;

public class Recursion {

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}

//array as parameter
public class ArrayAsParameter {

    static void printArray(int[] arr) {

        System.out.println("Array Elements:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        printArray(numbers);
    }
}
