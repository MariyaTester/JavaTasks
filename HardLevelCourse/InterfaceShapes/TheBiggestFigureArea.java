package HardLevelCourse.InterfaceShapes;

import HardLevelCourse.InterfaceShapes.Shapes;

public class TheBiggestFigureArea {
    public Shapes getTheBiggestArea(Shapes... figures) {
        Shapes theBiggestFigure = figures[0];
        for (Shapes shape : figures) {
            if (shape.getArea() > theBiggestFigure.getArea()) {
                theBiggestFigure = shape;
            }
        }
        return theBiggestFigure;
    }
}
