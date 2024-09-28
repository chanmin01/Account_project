package com.example.account.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // @CreatedDate와 @LastModifiedData를 인식하여 자동으로 시간 주입
public class JpaAuditingConfiguration {

}
