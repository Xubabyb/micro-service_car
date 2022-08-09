package my.home.service_car.service;

import my.home.service_car.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getList();

    Car getCarById(long id);
}
