package com.shop.mypay.api.payment.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TestResponseDto {

    private Boolean result;
    private String message;
}
