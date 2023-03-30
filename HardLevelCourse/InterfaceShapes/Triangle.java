package HardLevelCourse.InterfaceShapes;

public class Triangle implements Shapes {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int x3;
    public int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    @Override
    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    @Override
    public double getArea() {
        return Double.parseDouble(String.format("%.2f", (this.getHeight() * this.getWidth()) / 2)
                .replaceAll(",", "."));
    }

    @Override
    public double getPerimeter() {
        return Double.parseDouble(String.format("%.2f",
                        (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) +
                                Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)) +
                                Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2))))
                .replaceAll(",", "."));
    }

    public String toString() {
        return "Ширина треугольника = " + getWidth() +
                "\nВысота треугольника = " + getHeight() +
                "\nПлощадь треугольника = " + getArea() +
                "\nПериметр треугольника = " + getPerimeter();
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + x1;
        hash = prime * hash + x2;
        hash = prime * hash + x3;
        hash = prime * hash + y1;
        hash = prime * hash + y2;
        hash = prime * hash + y3;
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return x1 == triangle.x1 && x2 == triangle.x2 && x3 == triangle.x3 &&
                y1 == triangle.y1 && y2 == triangle.y2 && y3 == triangle.y3;
    }
}
