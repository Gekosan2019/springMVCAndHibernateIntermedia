package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void delete(Long id);
    void edit(Long id, User user);
    List<User> listUsers();
    User getUser(Long id);
}
