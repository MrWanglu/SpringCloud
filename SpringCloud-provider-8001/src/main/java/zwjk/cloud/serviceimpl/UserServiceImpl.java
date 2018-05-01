package zwjk.cloud.serviceimpl;

import com.zwjk.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zwjk.cloud.dao.UserMapper;
import zwjk.cloud.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 30-04-2018.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper dao;
    @Override
    public boolean add(User user) {
        return dao.addUser(user);
    }

    @Override
    public User get(Long userId) {
        return dao.findByUserId(userId);
    }

    @Override
    public List<User> list() {
        return dao.getAll();
    }
}
