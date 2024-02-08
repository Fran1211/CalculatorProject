package App;
import java.util.Scanner;
import App.Calculator;

public class Main {
    public static void main(String[] args){
        display();
    }

    public static void display(){
        Calculator cal = new Calculator();
        Scanner n = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1.Multiply\n2.Divide\n3.Addition\n4.Subtraction");
        String choice = n.next();

        switch(choice){
            case "1":
                System.out.println(cal.multiply());
                break;

            case "2":
                System.out.println(cal.divide());
                break;

            case "3":
                System.out.println(cal.addition());
                break;

            case "4":
                System.out.println(cal.subtraction());
                break;

            default:
                System.out.println("Input Error");




        }
    }

}
