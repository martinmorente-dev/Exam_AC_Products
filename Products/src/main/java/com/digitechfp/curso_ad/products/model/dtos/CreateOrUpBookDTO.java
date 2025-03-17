package com.digitechfp.curso_ad.products.model.dtos;

import lombok.Data;

@Data
public class CreateOrUpBookDTO
{
    private Integer id;
    private String name;
    private Integer price;
    private Integer stock;
}
