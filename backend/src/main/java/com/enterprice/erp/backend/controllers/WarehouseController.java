package com.enterprice.erp.backend.controllers;

import com.enterprice.erp.backend.entities.Warehouse;
import com.enterprice.erp.backend.services.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses") // Base URL for warehouse endpoints
@RequiredArgsConstructor
public class WarehouseController {

    // Injecting the service to handle business logic
    private final WarehouseService warehouseService;

    // Endpoint to add a new warehouse
    @PostMapping
    public ResponseEntity<Warehouse> addWarehouse(@RequestBody Warehouse warehouse) {
        Warehouse savedWarehouse = warehouseService.createWarehouse(warehouse);
        return ResponseEntity.ok(savedWarehouse);
    }

    // Endpoint to fetch all warehouses
    @GetMapping
    public ResponseEntity<List<Warehouse>> getAllWarehouses() {
        List<Warehouse> warehouses = warehouseService.getAllWarehouses();
        return ResponseEntity.ok(warehouses);
    }
}