package com.enterprice.erp.backend.services;

import com.enterprice.erp.backend.entities.Warehouse;
import com.enterprice.erp.backend.repositories.WarehouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WarehouseService {

    // Injecting the repository to interact with the database
    private final WarehouseRepository warehouseRepository;

    // Create and save a new warehouse
    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    // Retrieve all warehouses from the database
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    // Find a specific warehouse by its ID
    public Optional<Warehouse> getWarehouseById(Long id) {
        return warehouseRepository.findById(id);
    }
}