package com.marcosviniciusdev.controller;

import com.marcosviniciusdev.model.OrderModel;
import com.marcosviniciusdev.repository.OrderRepository;
import org.hibernate.id.GUIDGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/listall")
    public ResponseEntity<List<OrderModel>> listAll() {
        return ResponseEntity.ok(orderRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<OrderModel> saveClient(@RequestBody OrderModel order) {

        if (order.getId() == null || order.getId().isEmpty()) {
            order.setId(UUID.randomUUID().toString());
        }

        return ResponseEntity.ok(orderRepository.save(order));
    }

}
