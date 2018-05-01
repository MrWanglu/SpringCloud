package zwjk.cloud.dao;

import com.zwjk.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wanglu on 30-04-2018.
 */
@Mapper
public interface UserMapper {

    public boolean addUser(User suer);

    public User findByUserId(Long userId);

    public List<User> getAll();

}
