package com.marcosviniciusdev.repository;

import com.marcosviniciusdev.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, String> {
}
