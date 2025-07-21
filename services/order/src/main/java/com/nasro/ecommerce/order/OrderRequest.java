package com.nasro.ecommerce.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nasro.ecommerce.product.PurchaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record OrderRequest(
        Integer id,
        String reference,
        @Positive(message = "order amount should be positive")
        BigDecimal amount,
        @NotNull(message = "payment method should be precised")
        PaymentMethod paymentMethod,
        @NotNull(message = "customer method should be present")
        @NotEmpty(message = "customer method should be present")
        @NotBlank(message = "customer method should be present")
        String customerId,
        @NotEmpty(message = "you should at least pruchase one product")
        List<PurchaseRequest> products
) {
}
