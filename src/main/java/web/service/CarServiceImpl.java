package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Car 1", "car1", 1));
        cars.add(new Car("Car 2", "car2", 2));
        cars.add(new Car("Car 3", "car3", 3));
        cars.add(new Car("Car 4", "car4", 4));
        cars.add(new Car("Car 5", "car5", 5));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= 5) {
            return cars;
        } else if (count < 0) {
            return cars.stream()
                    .limit(0)
                    .collect(Collectors.toList());
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
