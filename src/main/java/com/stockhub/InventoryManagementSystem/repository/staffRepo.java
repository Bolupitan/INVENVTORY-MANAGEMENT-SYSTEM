package com.stockhub.InventoryManagementSystem.repository;

import com.stockhub.InventoryManagementSystem.Enities.staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface staffRepo extends JpaRepository<staff, Integer> {
}
