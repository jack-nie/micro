package com.hcp.microcourse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hcp.microcourse.domain")
public class MicroCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCourseApplication.class, args);
	}

}
