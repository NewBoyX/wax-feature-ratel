package com.unic.bluesky.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;

    public String get(String key) {
        return redisTemplate.opsForValue().get(key).toString();
    }

    public void set(String key, String value, long ttl) {
        redisTemplate.opsForValue().set(key, value, ttl);
    }
}
