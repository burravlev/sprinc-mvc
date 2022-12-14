package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}
