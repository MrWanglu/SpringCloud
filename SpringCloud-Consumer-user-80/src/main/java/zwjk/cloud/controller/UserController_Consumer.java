package zwjk.cloud.controller;

import com.zwjk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 01-05-2018.
 */
@RestController
public class UserController_Consumer {

    private static final String REST_URL_PRIFIX="http://localhost:8001";

    @Autowired
    private RestTemplate template;

    @RequestMapping(value = "/consumer/user/add")
    public boolean add(User user) {
        return template.postForObject(REST_URL_PRIFIX+"/user/add", user, Boolean.class);
    }

    @RequestMapping(value = "/consumer/user/get/{userId}")
    public User get(@PathVariable Long userId) {
        return template.getForObject(REST_URL_PRIFIX+"/user/get/"+userId,  User.class);
    }

    @RequestMapping(value = "/consumer/user/list")
    public List<User> list() {
        return template.getForObject(REST_URL_PRIFIX+"/user/list",List.class);
    }
}
