package com.example.mall.product.product_inquiry;

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
@Table(name = "product_inquiry_tb")
public class ProductInquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    private String answer;

    @ManyToOne (fetch = FetchType.LAZY)
    private User user;

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public ProductInquiry(Integer id, String content, String answer, User user, Timestamp createdAt) {
        this.id = id;
        this.content = content;
        this.answer = answer;
        this.user = user;
        this.createdAt = createdAt;
    }
}
