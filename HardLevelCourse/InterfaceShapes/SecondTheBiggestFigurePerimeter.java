package HardLevelCourse.InterfaceShapes;

import HardLevelCourse.InterfaceShapes.Shapes;

import java.util.Arrays;

public class SecondTheBiggestFigurePerimeter {
    public Shapes getSecondTheBiggestFigurePerimeter(Shapes... figures) {
        double[] perimeters = new double[figures.length];
        for (int i = 0; i < figures.length; i++) {
            perimeters[i] = figures[i].getPerimeter();
        }
        Arrays.sort(perimeters);
        double secondTheBiggestPerimeter = perimeters[perimeters.length - 2];
        int j = 0;
        while (figures[j].getPerimeter() != secondTheBiggestPerimeter) {
            j++;
        }
        return figures[j];
    }
}
