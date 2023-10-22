package web.service;

import web.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User getUserById(Long id);
}
