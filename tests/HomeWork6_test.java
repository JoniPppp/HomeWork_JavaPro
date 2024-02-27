import HomeWork6.Geometry.FiguresList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork6_test {
    FiguresList figuresList = new FiguresList();
    private double radius = 5;
    private double side = 5;
    private double a = 5;
    private double b = 5;
    private double c = 5;
    private double h = 5;
    private double p = (a + b + c) / 2;

    @Test
    public void Test1() {
        figuresList.addCircle(radius);
        figuresList.addSquare(side);
        figuresList.addTriangle(a, h);
        figuresList.addTriangle(a, b, c);

        double s = Math.PI * radius * radius +
                side * side +
                0.5 * a * h +
                Math.sqrt(p * (p - a) * (p - b) * (p - c));
        assertEquals(s, figuresList.getAreaSum());
    }

}
