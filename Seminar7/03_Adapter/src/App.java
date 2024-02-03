import Interfaces.iMeteoSensor;
import Interfaces.iSensorTemperature;
import Meteo.Adapter;
import Meteo.MeteoStore;
import Sensors.MS200;
import Sensors.ST500info;

public class App {
    public static void main(String[] args) throws Exception {
        MeteoStore meteoDB = new MeteoStore();
        iMeteoSensor oldSensor = new MS200(1);
        meteoDB.save(oldSensor);

        iSensorTemperature newSen = new ST500info();
        Adapter adapSens = new Adapter(newSen);
        meteoDB.save(adapSens);
    }
}
