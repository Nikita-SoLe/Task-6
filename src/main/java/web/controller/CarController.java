package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private final CarServiceImpl service;
    public CarController(CarServiceImpl service) {
        this.service = service;
    }
    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> carList = service.getCarList();

        if (count != null && count >= 1 && count < 5) {
            carList = carList.subList(0, count);
        }
        model.addAttribute("carList", carList);

        return "car";
    }
}
