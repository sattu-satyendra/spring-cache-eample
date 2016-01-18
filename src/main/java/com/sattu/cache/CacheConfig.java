package com.sattu.cache;

import java.util.HashSet;
import java.util.Set;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {
	
	
	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager simpleCacheManager=new SimpleCacheManager();
		Set<Cache> caches= new HashSet<Cache>();
		ConcurrentMapCache cache=new ConcurrentMapCache("testCache");
		caches.add(cache);
		simpleCacheManager.setCaches(caches);
		return simpleCacheManager;
	}

}
