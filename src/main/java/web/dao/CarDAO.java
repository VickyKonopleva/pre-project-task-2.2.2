package web.dao;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Mazeratti", 65363));
        cars.add(new Car(++CARS_COUNT, "Toyota", 7567));
        cars.add(new Car(++CARS_COUNT, "Mercedes", 425));
        cars.add(new Car(++CARS_COUNT, "Ferrari", 355));
        cars.add(new Car(++CARS_COUNT, "Porsche", 911));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
