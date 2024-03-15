package com.gduf.service.impl;

import com.gduf.pojo.user.User;
import com.gduf.service.FakeUserService;
import com.gduf.util.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class FakeUserServiceImpl implements FakeUserService {

    private final RedisCache redisCache;

    @Autowired
    public FakeUserServiceImpl(RedisCache redisCache) {
        this.redisCache = redisCache;
    }

    @Override
    public void generateFakeUser() {
        if (!Objects.isNull(redisCache.getCacheObject("login0")))
//            如果不存在login0这一个假用户的话 就先设置 方便调试
            redisCache.setCacheObject("login0", new User(0, "admin", "admin"));
    }
}
