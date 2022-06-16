import javax.xml.transform.Source;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),
        };
        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };
        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };


        Transport[] transports = new Transport[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            transports[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + cars.length + trucks.length] = bicycles[i];
        }

        ServiceStation station = new ServiceStation();


        for (int i = 0; i < transports.length; i++) {
            Transport transport=transports[i];
            station.check(transport);
        }
    }
}



        /*station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);*/

