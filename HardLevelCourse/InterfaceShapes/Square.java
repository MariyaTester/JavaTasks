package HardLevelCourse.InterfaceShapes;

public class Square implements Shapes {
    public double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getWidth() {
        return Double.parseDouble(String.format("%.2f", sideLength).replaceAll(",", "."));
    }

    @Override
    public double getHeight() {
        return Double.parseDouble(String.format("%.2f", sideLength).replaceAll(",", "."));
    }

    @Override
    public double getArea() {
        return Double.parseDouble(String.format("%.2f", sideLength * sideLength).replaceAll(",", "."));
    }

    @Override
    public double getPerimeter() {
        return Double.parseDouble(String.format("%.2f", sideLength * 4).replaceAll(",", "."));
    }

    public String toString() {
        return "Длина стороны квадрата (ширина, высота) = " + getWidth() +
                "\nПлощадь квадрата = " + getArea() +
                "\nПериметр квадрата = " + getPerimeter();
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int)sideLength;
        return hash;
    }
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Square square = (Square) obj;
        return sideLength == square.sideLength;
    }
}
