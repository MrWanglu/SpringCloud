package zwjk.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 01-05-2018.
 */
@SpringBootApplication   //启动类
@EnableEurekaServer  //声明这个类是Eureka的服务
public class EurekaServer_7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001_App.class, args);
    }
}
