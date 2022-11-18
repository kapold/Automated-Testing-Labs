package org.example;

public class Calculator {
    public Calculator() {}

    public double execute(double a, double b, char operation){
        double operationResult = 0;
        if(operation == '+')
            operationResult = a + b;
        else if (operation == '-')
            operationResult = a - b;
        else if (operation == '/')
            operationResult = a / b;
        else if (operation == '*')
            operationResult = a * b;
        else if (operation == '%')
            operationResult = a % b;

        return operationResult;
    }
}
