package HardLevelCourse.InterfaceShapes;

public class Rectangle implements Shapes {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return Double.parseDouble(String.format("%.2f", width).replaceAll(",", "."));
    }

    @Override
    public double getHeight() {
        return Double.parseDouble(String.format("%.2f", height).replaceAll(",", "."));
    }

    @Override
    public double getArea() {
        return Double.parseDouble(String.format("%.2f", width * height).replaceAll(",", "."));
    }

    @Override
    public double getPerimeter() {
        return Double.parseDouble(String.format("%.2f", 2 * (width * height)).replaceAll(",", "."));
    }

    public String toString() {
        return "Ширина прямоугольника = " + getWidth() +
                "\nВысота прямоугольника = " + getHeight() +
                "\nПлощадь прямоугольника = " + getArea() +
                "\nПериметр прямоугольника = " + getPerimeter();
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) width;
        hash = prime * hash + (int) height;
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;
    }
}
