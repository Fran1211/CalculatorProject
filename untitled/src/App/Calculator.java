package App;
import java.util.Scanner;
public class Calculator {


    public double multiply(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextDouble();
        System.out.println("Enter second number");
        double b = input.nextDouble();

        return a * b;
    }

    public double divide(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = input.nextDouble();
        System.out.println("Enter second number");
        double b = input.nextDouble();

        return a / b;
    }
    public double addition() {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = add.nextDouble();
        System.out.println("Enter second number");
        double b = add.nextDouble();

        return a + b;
    }
    public double subtraction() {

        Scanner sub = new Scanner(System.in);
        System.out.println("Enter first number");
        double c = sub.nextDouble();
        System.out.println("Enter second number");
        double d = sub.nextDouble();
        return c - d;
    }
}

