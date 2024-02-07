package App;
import java.util.Scanner;
import App.Calculator;

public class Main {
    public static void main(String[] args){

    }

    public static void display(){
        Calculator cal = new Calculator();
        Scanner n = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Multiply\n2. Divide");
        String choice = n.next();

        switch(choice){
            case "1":
                cal.multiply();
                break;

            case "2":
                cal.divide();
                break;

            case "3":
                cal.Addition();
                break;

            case "4":
                cal.Subtraction();
                break;




        }
    }

}
