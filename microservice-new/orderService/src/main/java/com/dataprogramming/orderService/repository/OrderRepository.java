package com.dataprogramming.orderService.repository;


import com.dataprogramming.orderService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
