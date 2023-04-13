public class Calculator {
    private double num1;
    private double num2;


    public Calculator() {
    }

    //Adds the two numbers
    public void addition(double num1,double num2){

        System.out.println("The addition of " + num1 + " and " + num2
        + " = " + (num1 + num2));
    }

    //Subtracts number 2 from number 1
    public void subtraction(double num1, double num2){


        System.out.println("The subtraction of " + num1 + " and " + num2
                + " = " + (num1 - num2));

    }



    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
