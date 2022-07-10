package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarController {
    private CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @GetMapping("/cars")
    public String getCar(@RequestParam(defaultValue = "5", required = true) int count,
                         Model model) {
        model.addAttribute("cars", carDAO.getCars(count));
        return "cars";
    }
}
