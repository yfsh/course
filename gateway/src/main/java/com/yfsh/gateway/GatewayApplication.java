package com.yfsh.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {

	//log日志框架的固定写法
	private static final Logger LOG = LoggerFactory.getLogger(GatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GatewayApplication.class);
		//env.getProperty("server.port")获取应用的端口
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成功！！");
		LOG.info("Gateway地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
