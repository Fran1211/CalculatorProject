import java.util.Scanner;

public class Caculator2 {

    public static void main(String[] args) {
        System.out.println(Addition());
        System.out.println(Subtraction());
    }

    public static double Addition() {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter first Number");
        double a = add.nextInt();
        System.out.println("Enter second Number");
        double b = add.nextInt();

        return a + b;
    }
        public static double Subtraction() {

            Scanner sub = new Scanner(System.in);
            System.out.println("Enter first Number");
            double c = sub.nextInt();
            System.out.println("Enter second Number");
            double d = sub.nextInt();

            return c - d;
        }
        ;
    }

