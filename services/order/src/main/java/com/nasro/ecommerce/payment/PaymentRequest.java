package com.nasro.ecommerce.payment;

import com.nasro.ecommerce.customer.CustomerResponse;
import com.nasro.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
                             BigDecimal amount,
                             PaymentMethod paymentMethod,
                             Integer orderId,
                             String orderReference,
                             CustomerResponse customer)
{
}
