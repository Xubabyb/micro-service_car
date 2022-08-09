package my.home.service_car.service;

import my.home.service_car.entity.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private List<Car> list;
    @Override
    public List<Car> getList() {
        if (list==null){
            list=new ArrayList<>(){{
                add(new Car(1L,"mazda","123mx458t"));
                add(new Car(2L,"toyota","754klj07t"));
                add(new Car(3L,"audi","985vb58t"));
            }};
        }
        return list;
    }

    @Override
    public Car getCarById(long id) {
        return getList().stream().filter(c->c.getId()==id).findFirst().orElseGet(Car::new);
    }
}
