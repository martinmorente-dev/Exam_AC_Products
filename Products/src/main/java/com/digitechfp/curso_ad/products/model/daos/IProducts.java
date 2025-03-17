package com.digitechfp.curso_ad.products.model.daos;

import com.digitechfp.curso_ad.products.model.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProducts extends JpaRepository<Products, Integer>
{
    List<Products> findByPriceLessThan(int price);

}
