package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    // Метод для получения всех пользователей (только чтение)
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    // Метод для сохранения пользователя (чтение и запись)
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    // Метод для обновления пользователя (чтение и запись)
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    // Метод для удаления пользователя (чтение и запись)
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    // Метод для получения пользователя по ID (только чтение)
    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
