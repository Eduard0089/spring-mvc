package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List <Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("UAZ Buhanka", 500, 1990));
        cars.add(new Car("BMW M5", 300, 2012));
        cars.add(new Car("VAZ 2199", 400, 1985));
        cars.add(new Car("PORSCHE 911", 380, 2015));
        cars.add(new Car("Mercedes G63", 320, 2020));
    }


    public List<Car> getCarsByCount(Integer count){
        if (count == null || count > cars.size()) {
            return cars;
        }
        List<Car> carsByCount = cars.stream()
                .limit(count)
                .collect(Collectors.toList());
        return carsByCount;
    }


}
