package org.example.Mapping.Practice.Controller;

import org.example.Mapping.Practice.Model.Laptop;
import org.example.Mapping.Practice.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @GetMapping("laptop")
    List<Laptop> getLaptop()
    {
        return laptopService.getLaptop();
    }

    //Post laptop
    @PostMapping("laptop/{laptops}")
    String postLaptop(@RequestBody List<Laptop> laptops)
    {
        return laptopService.postlaptop(laptops);
    }

    //Delete laptop
    @DeleteMapping("laptop/{Id}")
    String deleteLaptop(@PathVariable Long id)
    {
        return  laptopService.deleteLaptop(id);
    }

    @PutMapping("laptop/{price}/{Id}")
    String updatePrice(@PathVariable Integer price, @PathVariable Long Id)
    {
        return laptopService.updatePrice(price, Id);
    }
}
