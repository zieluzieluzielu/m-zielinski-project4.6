package com.kodilla;

public class Calculator {
    //sum method
    public double sumAplusB(double a, double b) {
        return a + b;
    }

    //substract method
    public double substractAfromB(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double substactResult = calculator.substractAfromB(1.4, 5.33);
        double sumResult = calculator.sumAplusB(1.4, 5.33);
        System.out.println("The substract result is " + substactResult);
        System.out.println("The sum result is " + sumResult);

    }
}
