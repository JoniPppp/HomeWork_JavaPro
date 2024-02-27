package HomeWork6.Geometry.figures;

import HomeWork6.Geometry.FigureSquare;

public class Circle implements FigureSquare {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaCalc() {
        return Math.PI * this.radius * this.radius;
    }
}
