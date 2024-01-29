// Interface Segregation Principle
public class EX03_ISP {
    
    // Интерфейс для двумерных фигур
    interface TwoDimensionalShape {
        double area();
    }

    // Интерфейс для трехмерных фигур
    interface ThreeDimensionalShape {
        double volume();
    }

    // Класс круга, реализующий интерфейс для двумерных фигур
    class Circle implements TwoDimensionalShape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    // Класс куба, реализующий интерфейс для двумерных и трехмерных фигур
    class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}
