package com.blackcandletech.redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.api.StatefulRedisConnection;
import com.lambdaworks.redis.api.sync.RedisStringCommands;

public class RedisCache {

    private final RedisClient redisClient;

    public RedisCache(RedisClient client)
    {
        this.redisClient = client;
    }

    public StatefulRedisConnection<String, String> connect() {
        return redisClient.connect();
    }

    public RedisStringCommands<String, String> getSync() {
        return connect().sync();
    }

    public RedisStringCommands<String, String> getAsync() {
        return connect().sync();
    }

}
