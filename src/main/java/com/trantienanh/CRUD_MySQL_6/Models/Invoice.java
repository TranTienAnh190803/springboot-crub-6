package com.trantienanh.CRUD_MySQL_6.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    @ManyToMany
    @JoinTable(
            name = "contain",
            joinColumns = @JoinColumn(name = "invoiceId"),
            inverseJoinColumns = @JoinColumn(name = "foodId")
    )
    private List<Food> foods;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}
