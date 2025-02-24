package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "RS6", "Red"));
        cars.add(new Car(2, "Audi", "RS7", "Orange"));
        cars.add(new Car(3, "Audi", "A6", "Yellow"));
        cars.add(new Car(4, "Mercedes", "C-Class", "Purple"));
        cars.add(new Car(5, "BMW", "Z4", "Blue"));
    }

    public List<Car> getAllCars() {
        return cars;

    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}

