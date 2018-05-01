package zwjk.cloud.controller;

import com.zwjk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zwjk.cloud.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 30-04-2018.
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    public boolean add(@RequestBody User user) {
        return service.add(user);
    }

    @RequestMapping(value = "user/get/{userId}", method = RequestMethod.GET)
    public User get(@PathVariable Long userId) {
        return service.get(userId);
    }

    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    public List<User> list() {
        return service.list();
    }
}
