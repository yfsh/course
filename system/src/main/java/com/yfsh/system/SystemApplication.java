package com.yfsh.system;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//让spring扫描com.yfsh这个包下所有的类，讲扫描到的类装配到spring容器中
//带有下面几种常见注解会被扫描到：@Component；@Controller；@RestControllr；@Service
@ComponentScan("com.yfsh")
//扫描mybatis的mapper
@MapperScan("com.yfsh.system.mapper")
@EnableEurekaClient
@SpringBootApplication
public class SystemApplication {

	//log日志框架的固定写法
	private static final Logger LOG = LoggerFactory.getLogger(SystemApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SystemApplication.class);
		//env.getProperty("server.port")获取应用的端口
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成功！！");
		LOG.info("System地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
