package com.trantienanh.CRUD_MySQL_6.Repositories;

import com.trantienanh.CRUD_MySQL_6.Models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
