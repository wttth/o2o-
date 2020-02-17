package com.imooc.o2o.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.SortingParams;
import redis.clients.util.SafeEncoder;

import java.util.List;
import java.util.Set;

public class JedisUtil {
    // 缓存生存时间
    private final int expire = 60000;
    // 操作Key的方法
    public Keys KEYS;
    // 对存储结构为String类型的操作
    public Strings STRINGS;
    // Redis连接池对象
    private JedisPool jedisPool;

    // 获取redis连接池
    public JedisPool getJedisPool() {
        return jedisPool;
    }

    // 设置redis连接池
    public void setJedisPool(JedisPoolWriper jedisPoolWriper) {
        this.jedisPool = jedisPoolWriper.getJedisPool();
    }

    // 从jedis连接池中获取获取jedis对象
    public Jedis getJedis() {
        return jedisPool.getResource();
    }

    // *******************************************Keys*******************************************//
    public class Keys {

        public Keys(JedisUtil jedisUtil) {
        }

        // 清空所有key
        public String flushAll() {
            Jedis jedis = getJedis();
            String stata = jedis.flushAll();
            jedis.close();
            return stata;
        }

        // 删除keys对应的记录,可以是多个key
        public long del(String... keys) {
            Jedis jedis = getJedis();
            long count = jedis.del(keys);
            jedis.close();
            return count;
        }

        // 判断key是否存在
        public boolean exists(String key) {
            // ShardedJedis sjedis = getShardedJedis();
            Jedis sjedis = getJedis();
            boolean exis = sjedis.exists(key);
            sjedis.close();
            return exis;
        }

        // 查找所有匹配给定的模式的键
        public Set<String> keys(String pattern) {
            Jedis jedis = getJedis();
            Set<String> set = jedis.keys(pattern);
            jedis.close();
            return set;
        }
    }

    // *******************************************Strings*******************************************//
    public class Strings {

        public Strings(JedisUtil jedisUtil) {
        }

        // 根据key获取记录
        public String get(String key) {
            // ShardedJedis sjedis = getShardedJedis();
            Jedis sjedis = getJedis();
            String value = sjedis.get(key);
            sjedis.close();
            return value;
        }

        // 添加记录,如果记录已存在将覆盖原有的value
        public String set(String key, String value) {
            return set(SafeEncoder.encode(key), SafeEncoder.encode(value));
        }

        // 添加记录,如果记录已存在将覆盖原有的value
        public String set(byte[] key, byte[] value) {
            Jedis jedis = getJedis();
            String status = jedis.set(key, value);
            jedis.close();
            return status;
        }
    }

}