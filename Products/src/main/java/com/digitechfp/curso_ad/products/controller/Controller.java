package com.digitechfp.curso_ad.products.controller;

import com.digitechfp.curso_ad.products.model.daos.IProducts;
import com.digitechfp.curso_ad.products.model.entities.Products;
import com.digitechfp.curso_ad.products.services.IControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller
{
    @Autowired
    private IControllerService controllerService;

    @GetMapping("/all")
    public List<Products> findProduct()
    {
        return controllerService.findProduct();
    }

    @GetMapping("/{price}")
    public List<Products> findLessPrice(@PathVariable int price)
    {
        return controllerService.findLessPrice(price);
    }

    @PostMapping("/create")
    public void saveProduct(@RequestBody Products product)
    {
        controllerService.createProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id)
    {
        controllerService.deleteProduct(id);
    }
}
