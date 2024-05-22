package com.BackEnd.MathStoreOnline2.entities;


import com.BackEnd.MathStoreOnline2.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String price;
    private byte[] img;


}