package com.example.mall.product.product_rating;

import com.example.mall.product.Product;
import com.example.mall.product.product_review.ProductReview;
import com.example.mall.user.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Lazy;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "product_rating_tb")
public class ProductRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double rating;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ProductRating productRating;

    @Builder
    public ProductRating(Integer id, double rating, User user, Product product, ProductRating productRating) {
        this.id = id;
        this.rating = rating;
        this.user = user;
        this.product = product;
        this.productRating = productRating;
    }
}
