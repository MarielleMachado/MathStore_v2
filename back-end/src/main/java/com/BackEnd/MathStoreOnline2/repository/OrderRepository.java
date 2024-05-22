package com.BackEnd.MathStoreOnline2.repository;

import com.BackEnd.MathStoreOnline2.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findFirstByEmail(Long id_order);
}