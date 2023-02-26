package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarsByCount(List<Car> cars, int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
