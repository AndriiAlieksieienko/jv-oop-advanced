package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Figure getRandomFigure() {
        Figures randomFigure = Figures.values()[new Random().nextInt(Figures.values().length)];

        if (randomFigure == Figures.SQUARE) {
            return new Square(colorSupplier.getRandomColor(), getRandomNumber());
        }
        if (randomFigure == Figures.RECTANGLE) {
            return new Rectangle(
                    colorSupplier.getRandomColor(),
                    getRandomNumber(),
                    getRandomNumber()
            );
        }
        if (randomFigure == Figures.CIRCLE) {
            return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
        }
        if (randomFigure == Figures.RIGHT_TRIANGLE) {
            return new RightTriangle(
                    colorSupplier.getRandomColor(),
                    getRandomNumber(),
                    getRandomNumber()
            );
        }
        if (randomFigure == Figures.ISOSCELES_TRAPEZOID) {
            return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber()
            );
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }
}
