package org.example.Mapping.Practice.Repository;

import org.example.Mapping.Practice.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
