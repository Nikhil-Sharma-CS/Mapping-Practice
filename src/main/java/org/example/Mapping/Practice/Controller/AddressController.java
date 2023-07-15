package org.example.Mapping.Practice.Controller;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //Get Addresses
    @GetMapping("address")
    List<Address> getAddress()
    {
        return addressService.getAddress();
    }

    //Post Address
    @PostMapping("address/{addresses}")
    String postAddress(@RequestBody List<Address> addresses)
    {
        return addressService.postAddress(addresses);
    }

    //Delete Address
    @DeleteMapping("address/{Id}")
    String deleteAddress(@PathVariable Long id)
    {
        return  addressService.deleteAddress(id);
    }

    @PutMapping("address/{landmark}/{Id}")
    String updateLandmark(@PathVariable String landmark, @PathVariable Long Id)
    {
        return addressService.updateLandmark(landmark, Id);
    }
}
