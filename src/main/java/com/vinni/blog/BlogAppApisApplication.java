package com.vinni.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@SpringBootApplication(scanBasePackages= {
//        "com.vinni.blog"
//})
@SpringBootApplication
//@EnableJpaRepositories
@EntityScan(basePackages = {"com.vinni.blog.entities"})
public class BlogAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

}
