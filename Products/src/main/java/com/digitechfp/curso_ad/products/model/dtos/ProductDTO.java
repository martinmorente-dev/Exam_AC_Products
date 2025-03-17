package com.digitechfp.curso_ad.products.model.dtos;

import com.digitechfp.curso_ad.products.model.entities.Products;
import lombok.Data;

@Data
public class ProductDTO
{
    private Integer id;
    private String name;
    private Integer price;
    private Integer stock;

    public ProductDTO(Products product)
    {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.stock = product.getStock();
    }
}