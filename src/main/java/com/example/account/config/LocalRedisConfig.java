//package org.example.account.config;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import redis.embedded.RedisServer;
//
//@Configuration
//public class LocalRedisConfig {
//    @Value("${spring.redis.port}")// yml 설정 파일에서 특정 경로의 값을 가져와 담아줌
//    private int redisPort;
//
//
//    private RedisServer redisServer;
//
//    @PostConstruct
//    public void startRedis() {
//        redisServer = new RedisServer(redisPort);
//        redisServer.start();
//    }
//
//    @PreDestroy
//    public void stopRedis() {
//        if (redisServer != null) {
//            redisServer.stop();
//        }
//
//    }
//}
