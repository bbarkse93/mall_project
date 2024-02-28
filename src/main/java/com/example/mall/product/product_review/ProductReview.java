package com.example.mall.product.product_review;

import com.example.mall.product.Product;
import com.example.mall.user.User;
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
@Table(name = "product_review_tb")
public class ProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private String reviewImage;

    @ManyToOne (fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public ProductReview(Integer id, String content, String reviewImage, Product product, User user, Timestamp createdAt) {
        this.id = id;
        this.content = content;
        this.reviewImage = reviewImage;
        this.product = product;
        this.user = user;
        this.createdAt = createdAt;
    }
}
