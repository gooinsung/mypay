package com.shop.mypay.api.payment.controller;

import com.shop.mypay.api.payment.dto.TestRequestDto;
import com.shop.mypay.api.payment.dto.TestResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    @PostMapping("/test")
    public ResponseEntity<TestResponseDto> testAPI(@RequestBody TestRequestDto testRequestDto) {
        log.info("==================== test API 실행 ====================");
        log.info("TestRequestDto : {}", testRequestDto);
        return ResponseEntity.ok().body(TestResponseDto.builder().message("성공입니다.").result(Boolean.TRUE).build());
    }
}
