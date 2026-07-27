package com.enterprice.erp.backend.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Optional;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //connect Inventory to products
    @ManyToOne(optional=false)
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;
    //connect Inventory to warehouse
    @ManyToOne(optional=false)
    @JoinColumn(name = "warehouse_id",nullable = false)
    private Warehouse warehouse;
    //quantity variable
    private Integer quantity;
    private Integer minimumStockLevel;


}

