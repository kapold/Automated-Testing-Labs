package org.example;

public class TriangleDetector {
    public TriangleDetector(){}

    public boolean isExists(double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
    }
}
