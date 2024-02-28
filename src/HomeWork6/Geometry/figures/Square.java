package HomeWork6.Geometry.figures;

import HomeWork6.Geometry.FigureSquare;

public class Square implements FigureSquare {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double areaCalc() {

        return this.side * this.side;
    }
}
