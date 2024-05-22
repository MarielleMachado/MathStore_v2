package com.BackEnd.MathStoreOnline2.repository;

import com.BackEnd.MathStoreOnline2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findFirstByEmail(Long id);
}
