package com.enterprice.erp.backend.services;

import com.enterprice.erp.backend.entities.Inventory;
import com.enterprice.erp.backend.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    // Add new stock to a warehouse
    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    // Get all inventory records
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
}