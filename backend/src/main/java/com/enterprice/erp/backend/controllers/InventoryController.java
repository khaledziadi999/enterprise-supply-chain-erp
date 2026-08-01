package com.enterprice.erp.backend.controllers;

import com.enterprice.erp.backend.entities.Inventory;
import com.enterprice.erp.backend.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    // Endpoint to add stock
    @PostMapping
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory) {
        Inventory savedInventory = inventoryService.addInventory(inventory);
        return ResponseEntity.ok(savedInventory);
    }

    // Endpoint to view all stock
    @GetMapping
    public ResponseEntity<List<Inventory>> getAllInventory() {
        return ResponseEntity.ok(inventoryService.getAllInventory());
    }
}