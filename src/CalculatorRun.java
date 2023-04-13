import java.util.Scanner;

public class CalculatorRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        int choice = 0;
        Calculator calculator = new Calculator();

        System.out.println("---This is a Simple Calculator App---\n---It Can only perform addition and subtraction---");

        while(true){

            System.out.println("Enter your two numbers: ");
            System.out.println("num 1: ");
            num1 = input.nextDouble();
            System.out.println("num 2: ");
            num2 = input.nextDouble();


            System.out.println("Choose:\n1.Addition\n2.Subtraction\n3.Exit");
            choice = input.nextInt();

            switch (choice){

                case 1: calculator.addition(num1,num2);break;
                case 2: calculator.subtraction(num1,num2);break;
                case 3: System.exit(1);break;
                default:
                    System.out.println("Invalid value"); break;
            }





        }



    }
}
