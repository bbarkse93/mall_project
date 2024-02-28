package com.example.mall.product.product_inquiry;

import com.example.mall.product.product_image.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInquiryJPARepository extends JpaRepository<ProductInquiry, Integer> {
}
