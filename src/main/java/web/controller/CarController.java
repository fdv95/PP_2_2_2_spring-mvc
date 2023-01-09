package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("count", carService.getCarsList(count));
        return "cars";
    }
}
