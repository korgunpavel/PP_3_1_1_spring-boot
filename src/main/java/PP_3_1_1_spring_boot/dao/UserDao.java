package PP_3_1_1_spring_boot.dao;

import PP_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(long id);
    void save(User user);
    void update(long id, User updUser);
    void delete(long id);
}
