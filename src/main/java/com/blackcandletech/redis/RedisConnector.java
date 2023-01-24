package com.blackcandletech.redis;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisURI;

public class RedisConnector {

    private RedisClient client;
    private RedisCache cache;
    private RedisMessenger messenger;

    public RedisConnector(String uri)
    {
        RedisClient client = RedisClient.create(RedisURI.create(uri));
        this.cache = new RedisCache(client);
    }

}
