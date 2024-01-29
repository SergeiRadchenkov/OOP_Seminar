// Open-Closed Principle
public class EX02_OCP {
    
    public class SpeedCalculation {

        public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.calculateAllowedSpeed();
        }
    }
    
    class Vehicle {
        int maxSpeed;
        String type;
    
        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }
    
        public int getMaxSpeed() {
            return this.maxSpeed;
        }
    
        public String getType() {
            return this.type;
        }
    
        // Метод для расчета разрешенной скорости
        public double calculateAllowedSpeed() {
            return 0.0;
        }
    }
    // Класс Car - наследник Vehicle
    class Car extends Vehicle {
        public Car(int maxSpeed) {
            super(maxSpeed, "Car");
        }

        // Метод открыт для модификации
        @Override
        public double calculateAllowedSpeed() {
            return getMaxSpeed() * 0.8;
        }
    }
    // Класс Bus - наследник Vehicle
    class Bus extends Vehicle {
        public Bus(int maxSpeed) {
            super(maxSpeed, "Bus");
        }
        // Метод открыт для модификации
        @Override
        public double calculateAllowedSpeed() {
            return getMaxSpeed() * 0.6;
        }
    }
}
