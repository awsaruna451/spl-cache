package com.uob.splcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SplCacheApplication {

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(SplCacheApplication.class, args)));
	}

}
