package com.digitechfp.curso_ad.products.services;

import com.digitechfp.curso_ad.products.model.daos.IProducts;
import com.digitechfp.curso_ad.products.model.entities.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class controllerService implements IControllerService
{
    private final IProducts productsDAO;

    @Autowired
    public controllerService(IProducts productsDAO)
    {
        this.productsDAO = productsDAO;
    }

    @Override
    public List<Products> findProduct()
    {
        return (List<Products>) productsDAO.findAll();
    }

    @Override
    public List<Products> findLessPrice(int price)
    {
        return productsDAO.findByPriceLessThan(price);
    }

    @Override
    public void createProduct(Products product)
    {
        productsDAO.save(product);
    }

    @Override
    public void deleteProduct(Integer id)
    {
        productsDAO.deleteById(id);
    }
}
