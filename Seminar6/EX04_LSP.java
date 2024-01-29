// Liskov Substitution Principle
public class EX04_LSP {
    
    // Базовый класс для прямоугольника
    class Rectangle {
        private int width;
        private int height;
        
        // Установка ширины прямоугольника
        public void setWidth(int width) {
            this.width = width;
        }
        
        // Установка высоты прямоугольника
        public void setHeight(int height) {
            this.height = height;
        }
        
        // Вычисление площади прямоугольника
        public int area() {
            return this.width * this.height;
        }
    }
    
    // Класс квадрата, расширяющий базовый класс прямоугольника
    class Square extends Rectangle {
        // Переопределение метода установки ширины для квадрата
        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }
    
        // Переопределение метода установки высоты для квадрата
        @Override
        public void setHeight(int height) {
            super.setWidth(height);
            super.setHeight(height);
        }
    }
}
