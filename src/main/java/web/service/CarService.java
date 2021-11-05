package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes Benz", "500", "Black"));
        cars.add(new Car("BMW", "M5", "Blue"));
        cars.add(new Car("Audi", "S8", "White"));
        cars.add(new Car("Toyota", "LC 200", "Grey"));
        cars.add(new Car("Aston Martin", "DB9", "Deep blue"));
    }

    public List<Car> index(String count) {
        if (count == null) {
            return cars;
        } else {
            int i = Integer.parseInt(count);
            return i < 5 ? cars.subList(0, i) : cars;
        }
    }
}
