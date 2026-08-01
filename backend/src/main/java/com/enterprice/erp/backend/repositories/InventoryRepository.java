package com.enterprice.erp.backend.repositories;

import com.enterprice.erp.backend.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
     //product countite
    List<Inventory> findByProductId(Long productId);
    //repository size
    List<Inventory> findByWarehouseId(Long warehouseId);
}