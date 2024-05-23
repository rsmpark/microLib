package com.rkpk.bookstore.catalogservice.domain.map;

import com.rkpk.bookstore.catalogservice.domain.dto.Product;
import com.rkpk.bookstore.catalogservice.domain.entity.ProductEntity;

public class ProductMapper {

    public static Product toProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice());
    }
}