import java.util.Scanner;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }


    public double area() {

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}




