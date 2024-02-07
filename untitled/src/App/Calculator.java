package App;
import java.util.Scanner;
public class Calculator {


    public double multiply(){
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        return a * b;
    }

    public double divide(){
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        return a / b;
    }
    public double Addition() {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter first Number");
        double a = add.nextInt();
        System.out.println("Enter second Number");
        double b = add.nextInt();

        return a + b;
    }
    public double Subtraction() {

        Scanner sub = new Scanner(System.in);
        System.out.println("Enter first Number");
        double c = sub.nextInt();
        System.out.println("Enter second Number");
        double d = sub.nextInt();

        return c - d;
    }
}

