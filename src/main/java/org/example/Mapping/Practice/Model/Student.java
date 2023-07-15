package org.example.Mapping.Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentAge;
    private String phoneNumber;
    private String studentBranch;
    private String studentDepartment;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

}
