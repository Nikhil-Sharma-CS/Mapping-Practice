package org.example.Mapping.Practice.Service;

import org.example.Mapping.Practice.Model.Address;
import org.example.Mapping.Practice.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> getAddress() {
        return iAddressRepo.findAll();
    }

    public String postAddress(List<Address> addresses) {
        iAddressRepo.saveAll(addresses);
        return "Addresses Saved";
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "Address Deleted";
    }

    public String updateLandmark(String landmark, Long id) {

        Address address = iAddressRepo.findById(id).orElse(null);

        if(address != null)
        {
            address.setLandmark(landmark);
            iAddressRepo.save(address);
            return "Landmark Updated";
        }
        return "Address Does Not Exists";

    }
}
