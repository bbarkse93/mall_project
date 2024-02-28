package com.example.mall.product.product_image;

import com.example.mall.product.Product;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "product_image_tb")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productImage;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Builder
    public ProductImage(Integer id, String productImage, Product product) {
        this.id = id;
        this.productImage = productImage;
        this.product = product;
    }
}
