package org.zlasu.car;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Controller
//@RestController
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @RequestMapping(value = "/car-home", method = RequestMethod.GET)
    //@GetMapping("/car-home")
    @ResponseBody
    public String homeAction() {

        return carDao.getCars().stream()
                .map(c -> c.getBrand())
                .collect(Collectors.joining(" - "));
    }



    @RequestMapping(value = "/car-home-super", method = RequestMethod.GET)
    //@ResponseBody
    public String homeAction(Model model) {
        model.addAttribute("cos", "cos");
        return "index.jsp";
    }
}
