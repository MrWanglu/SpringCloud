package zwjk.cloud.cofigbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanglu on 01-05-2018.
 */
@Configuration      //等价于：<bean id="xxx" class="xxx.xxx.xxx"></bean>
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
