package Interfaces;

import java.time.LocalDateTime;

public interface iMeteoSensor {
    int getId();

    Float getTemperature();

    Float getHumidity();

    Float getPressure();

    LocalDateTime getDateTime();
}
