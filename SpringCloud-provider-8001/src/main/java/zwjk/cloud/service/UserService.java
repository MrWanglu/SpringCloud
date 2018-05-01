package zwjk.cloud.service;

import com.zwjk.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 30-04-2018.
 */
public interface UserService {
    public boolean add(User user);

    public User get(Long userId);

    public List<User> list();
}
