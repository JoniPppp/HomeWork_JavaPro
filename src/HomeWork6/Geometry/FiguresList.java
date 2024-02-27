package HomeWork6.Geometry;

import HomeWork6.Geometry.figures.Circle;
import HomeWork6.Geometry.figures.Square;
import HomeWork6.Geometry.figures.Triangle;

import java.util.ArrayList;

public class FiguresList {
    private ArrayList<FigureSquare> figuresList = new ArrayList<>();

    public FiguresList() {

    }

    public void addCircle(double radius) {
        this.figuresList.add(new Circle(radius));
    }

    public void addSquare(double side) {
        this.figuresList.add(new Square(side));
    }

    public void addTriangle(double a, double h) {
        this.figuresList.add(new Triangle(a, h));
    }

    public void addTriangle(double a, double b, double c) {
        this.figuresList.add(new Triangle(a, b, c));
    }

    public double getAreaSum() {
        double areaSum = 0;
        for (FigureSquare k : figuresList) {
            areaSum += k.areaCalc();
        }
        return areaSum;
    }
}
