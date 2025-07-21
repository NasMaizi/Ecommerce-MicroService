package com.nasro.ecommerce.kafka;

import com.nasro.ecommerce.customer.CustomerResponse;
import com.nasro.ecommerce.order.PaymentMethod;
import com.nasro.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
