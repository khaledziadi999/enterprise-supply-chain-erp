package com.enterprice.erp.backend.entities;
import jakarta.persistence.*;
import jdk.jfr.StackTrace;
import lombok.*;
@Entity
@Table(name = "warehouses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String city;
    private Integer capacity;
}
