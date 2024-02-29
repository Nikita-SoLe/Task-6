package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(Integer count) {
        List<Car> listCar = new ArrayList<>();

        listCar.add(new Car("Mercedes", "black", 650));
        listCar.add(new Car("BMW", "white", 720));
        listCar.add(new Car("Reno", "grey", 1320));
        listCar.add(new Car("Peugeot", "yellow", 320));
        listCar.add(new Car("Lada", "redCherry", 2109));

        if (count != null && count >= 1 && count < 5) {
            return listCar.subList(0, count);
        }
        return listCar;
    }
}
