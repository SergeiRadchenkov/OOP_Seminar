// Dependency Inversion Principle
public class EX05_DIP {
    
    // Интерфейс для двигателя
    interface Engine {
        void start();
    }

    // Класс бензинового двигателя, реализующий интерфейс Engine
    class PetrolEngine implements Engine {
        @Override
        public void start() {
            // Реализация запуска бензинового двигателя
            System.out.println("Petrol engine started");
        }
    }

    // Класс дизельного двигателя, реализующий интерфейс Engine
    class DieselEngine implements Engine {
        @Override
        public void start() {
            // Реализация запуска дизельного двигателя
            System.out.println("Diesel engine started");
        }
    }

    // Класс автомобиля с зависимостью от интерфейса Engine
    class Car {
        private Engine engine;

        // Внедрение зависимости через конструктор
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void start() {
            // Запуск двигателя
            this.engine.start();
        }
    }
}
