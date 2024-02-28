package com.example.mall.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "product_tb")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false, unique = true)
    private String productName;
    @Column(nullable = false)
    private Long productDescription;
    @Column(nullable = false)
    private Integer price;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Product(Integer id, String productName, Long productDescription, Integer price, Timestamp createdAt) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.createdAt = createdAt;
    }
}
