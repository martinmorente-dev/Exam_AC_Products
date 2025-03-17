package com.digitechfp.curso_ad.products.services;

import com.digitechfp.curso_ad.products.model.entities.Products;

import java.util.List;

public interface IControllerService
{
    List<Products> findProduct();
    List<Products> findLessPrice(int price);
    void createProduct(Products product);
    void deleteProduct(Integer id);
}
