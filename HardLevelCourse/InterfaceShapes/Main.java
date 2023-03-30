package HardLevelCourse.InterfaceShapes;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(30);
        Square square2 = new Square(5.05);
        Square square3 = new Square(4.689);
        Triangle triangle1 = new Triangle(1,1, 3, 5, 4, 1);
        Triangle triangle2 = new Triangle(1,3,3,5,3,1);
        Rectangle rectangle1 = new Rectangle(20, 14);
        Rectangle rectangle2 = new Rectangle(20, 14);
        Circle circle1 = new Circle(5.1);
        Circle circle2 = new Circle(30);
        Circle circle3 = new Circle(15);
        TheBiggestFigureArea theBiggestArea = new TheBiggestFigureArea();
        SecondTheBiggestFigurePerimeter theBiggestFigurePerimeter = new SecondTheBiggestFigurePerimeter();
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(square1.equals(circle3));
        System.out.println(square1.equals(circle2));
        System.out.println(triangle1.equals(null));
        System.out.println(triangle2.equals(triangle2));
        System.out.println("\nФигура с самой большой площадью:\n" + theBiggestArea.getTheBiggestArea(square1, square2, square3, triangle1, triangle2,
                rectangle1, rectangle2, circle1, circle2, circle3));
        System.out.println("\nФигура с самым большим периметром:\n" + theBiggestFigurePerimeter.getSecondTheBiggestFigurePerimeter(square1, square2, square3, triangle1, triangle2,
                rectangle1, rectangle2, circle1, circle2, circle3));
    }
}
