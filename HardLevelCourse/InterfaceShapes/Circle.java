package HardLevelCourse.InterfaceShapes;

public class Circle implements Shapes {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getWidth() {
        return Double.parseDouble(String.format("%.2f", 2 * radius).replaceAll(",", "."));
    }

    @Override
    public double getHeight() {
        return Double.parseDouble(String.format("%.2f", 2 * radius).replaceAll(",", "."));
    }

    @Override
    public double getArea() {
        return Double.parseDouble(String.format("%.2f", (Math.PI * Math.pow(radius, 2)))
                .replaceAll(",", "."));
    }

    @Override
    public double getPerimeter() {
        return Double.parseDouble(String.format("%.2f", (2 * Math.PI * radius))
                .replaceAll(",", "."));
    }

    public String toString() {
        return "Диаметр круга (ширина, высота) = " + getWidth() +
                "\nПлощадь круга = " + getArea() +
                "\nПериметр круга (длина окружности) = " + getPerimeter();
    }
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int)radius*2;
        return hash;
    }
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Circle circle = (Circle) obj;
        return radius == circle.radius;
    }
}
