package HomeWork6.Geometry.figures;

import HomeWork6.Geometry.FigureSquare;

public class Triangle implements FigureSquare {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public Triangle(double a, double b, double c) {
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a) && (a > 0) && (b > 0) && (c > 0)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else System.out.println("Such triangle doesn't exist");
    }

    @Override
    public double areaCalc() {
        double s = 0;
        if ((this.b == 0) || (this.c == 0))
            s = 0.5 * this.a * this.h;

        else {
            double p = (this.a + this.b + this.c) / 2;
            s = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        }
        return s;
    }

}
