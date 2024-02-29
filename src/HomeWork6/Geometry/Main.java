package HomeWork6.Geometry;

public class Main {
    public static void main(String[] args) {

        FiguresList figuresList = new FiguresList();
        figuresList.addCircle(5.0);
        figuresList.addSquare(5.0);
        figuresList.addTriangle(5.0, 5.0);
        figuresList.addTriangle(5.0, 5.0, 5.0);
        System.out.println(figuresList.getAreaSum());

    }
}
