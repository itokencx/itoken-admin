package com.funtl.itoken.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cx
 * @Package: com.funtl.itoken.admin
 * @ClassName: AdminApplication
 * @Description:
 * @Date 2019/11/29 14:25
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class AdminApplication {
    public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
    	}
}
