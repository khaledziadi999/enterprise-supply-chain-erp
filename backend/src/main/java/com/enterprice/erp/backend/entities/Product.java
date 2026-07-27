package com.enterprice.erp.backend.entities;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String sku; //code Qr
    @Column(nullable = false)
    private String name; //product name
    private  Double basePrice; //product price


}
