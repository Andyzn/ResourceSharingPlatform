package com.andy.resourcesharingplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Spring Boot程序入口
 * @author Andy
 * @date 2017/11/05 22:29
 */
@SpringBootApplication
public class ResourceSharingPlatformApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ResourceSharingPlatformApplication.class, args);
	}

	/**
	 * 外部Servlet容器入口
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ResourceSharingPlatformApplication.class);
	}
}
