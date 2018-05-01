package zwjk.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wanglu on 30-04-2018.
 */
@MapperScan(value = "zwjk.cloud.dao")
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自己动注册进Eureka的服务中心中
public class UserProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(UserProvider8001_App.class, args);
    }
}
