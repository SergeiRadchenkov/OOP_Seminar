package Sensors;

import java.time.LocalDateTime;

import Interfaces.iMeteoSensor;

public class MS200 implements iMeteoSensor {
    int id;

    public MS200(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Float getTemperature() {
        return (float) 20;
    }

    public Float getHumidity() {
        return (float) 60;
    }

    public Float getPressure() {
        return (float) 752.4;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
