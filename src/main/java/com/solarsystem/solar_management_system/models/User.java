package com.solarsystem.solar_management_system.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseEntity {



    @Column(nullable = false, unique = true, length = 50)
    private  String username;

    @Column(nullable = false,length = 255)
    private  String password_hash;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    // Example: if you want to assign a user to multiple quotations/sales/purchases
    // You can define relations like this (optional depending on how you're mapping things)

//    @OneToMany(mappedBy = "createdByUser")
//    private Set<Quotation> quotations;
//
//    @OneToMany(mappedBy = "createdByUser")
//    private Set<Purchase> purchases;

    public enum Role {
        ADMIN,
        SALES,
        TECHNICIAN,
        MANAGER
        // add more roles as per your ERD or use a separate Role entity if needed
    }

    
}
