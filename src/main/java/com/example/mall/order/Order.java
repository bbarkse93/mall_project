package com.example.mall.order;

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
@Table(name = "order_tb")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @CreationTimestamp
    private Timestamp CreatedAt;

    @Builder
    public Order(Integer id, User user, Product product, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.product = product;
        CreatedAt = createdAt;
    }
}
