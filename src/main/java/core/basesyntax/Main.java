package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static FigureSupplier getFigureSupplier() {
        return figureSupplier;
    }

    public static void main(String[] args) {
        Drawable[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Drawable figure: figures) {
            figure.draw();
        }
    }
}
