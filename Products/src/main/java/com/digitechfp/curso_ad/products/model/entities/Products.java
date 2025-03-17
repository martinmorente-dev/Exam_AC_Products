package com.digitechfp.curso_ad.products.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Products
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",length = 100,nullable = false)
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name= "stock")
    private int stock;
}
