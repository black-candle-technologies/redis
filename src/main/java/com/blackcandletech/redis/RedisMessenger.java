package com.blackcandletech.redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.pubsub.StatefulRedisPubSubConnection;
import com.lambdaworks.redis.pubsub.api.async.RedisPubSubAsyncCommands;
import com.lambdaworks.redis.pubsub.api.sync.RedisPubSubCommands;

public class RedisMessenger {

    private final RedisClient redisClient;

    public RedisMessenger(RedisClient client)
    {
        this.redisClient = client;
    }

    public StatefulRedisPubSubConnection<String, String> connect() {
        return redisClient.connectPubSub();
    }

    public RedisPubSubCommands<String, String> getSync() {
        return connect().sync();
    }

    public RedisPubSubAsyncCommands<String, String> getAsync() {
        return connect().async();
    }

}
