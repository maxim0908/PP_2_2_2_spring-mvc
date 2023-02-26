package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService car;

    @GetMapping("/cars")
    public String carsByCount(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Car 1", "car1", 1));
        cars.add(new Car("Car 2", "car2", 2));
        cars.add(new Car("Car 3", "car3", 3));
        cars.add(new Car("Car 4", "car4", 4));
        cars.add(new Car("Car 5", "car5", 5));

        model.addAttribute("carsByCountAttribute", car.getCarsByCount(cars, count));
        return "cars";
    }
}
