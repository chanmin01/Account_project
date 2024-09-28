package com.example.account.dto;

import com.example.account.domain.Account;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

public class CreateAccount {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
        // 외부 클래스의 인스턴스와 관계없이 독립적으로 사용하기 위해 static으로 선언
        @NotNull
        @Min(1)
        private Long userId;

        @NotNull
        @Min(0)
        private Long InitialBalance;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long userId;
        private String accountNumber;
        private LocalDateTime registeredAt;

        public static Response from(AccountDto accountDto) {
            return Response.builder()
                    .userId(accountDto.getUserId())
                    .accountNumber(accountDto.getAccountNumber())
                    .registeredAt(accountDto.getRegisteredAt())
                    .build();
        }
    }
}
