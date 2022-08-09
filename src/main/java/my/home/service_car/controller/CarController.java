package my.home.service_car.controller;

import lombok.AllArgsConstructor;
import my.home.service_car.entity.Car;
import my.home.service_car.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {
    private final CarService service;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getAllCar() {
        return service.getList();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Car getPersonById(@PathVariable("id") long id) {
        return service.getCarById(id);
    }
}
