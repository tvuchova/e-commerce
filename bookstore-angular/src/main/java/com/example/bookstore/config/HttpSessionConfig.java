package com.example.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;



/**
 * Creates a Spring Bean with the name of  
 * {@link springSessionRepositoryFilter}.
 * that implements Filter. The filter is what is in charge of replacing the HttpSession implementation to be backed by Spring Session. 
 * In this instance Spring Session is backed by Redis.
 * We create a RedisConnectionFactory that connects Spring Session to the Redis Server. 
 * We configure the connection to connect to localhost on the default port (6379) 
 *
 */

@EnableRedisHttpSession
public class HttpSessionConfig {
	
	@Bean
	public LettuceConnectionFactory connectionFactory() {
		return new LettuceConnectionFactory();
	}

}
