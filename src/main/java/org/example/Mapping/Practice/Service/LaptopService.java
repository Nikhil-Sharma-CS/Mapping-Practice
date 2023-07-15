package org.example.Mapping.Practice.Service;

import org.example.Mapping.Practice.Model.Laptop;
import org.example.Mapping.Practice.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo iLaptopRepo;


    public List<Laptop> getLaptop() {
        return iLaptopRepo.findAll();
    }

    public String postlaptop(List<Laptop> laptops) {
        iLaptopRepo.saveAll(laptops);
        return "Laptops Saved";
    }

    public String deleteLaptop(Long id) {
        iLaptopRepo.deleteById(id);
        return "Laptop Deleted";
    }

    public String updatePrice(Integer price, Long id) {

        Laptop laptop = iLaptopRepo.findById(id).orElse(null);

        if(laptop != null)
        {
            laptop.setLaptopPrice(price);
            iLaptopRepo.save(laptop);
            return "Price Updated";
        }
        return "Laptop Not Found";
    }
}
