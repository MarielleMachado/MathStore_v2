package com.BackEnd.MathStoreOnline2.entities;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;
    private String total;
    private String status;
    private String products;
    private byte[] img;


}