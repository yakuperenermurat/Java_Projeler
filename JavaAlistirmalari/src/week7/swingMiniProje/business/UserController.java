package week7.swingMiniProje.business;

import week7.swingMiniProje.dao.UserDao;
import week7.swingMiniProje.entity.User;

import java.util.ArrayList;

public class UserController {
    private UserDao userDao;

    public UserController() {
        this.userDao = new UserDao();
    }

    public ArrayList<User> findAll() {
        return this.userDao.findAll();
    }


    public User getById(int id) {
        if (id == 0){
            System.out.println("ID değeri 0 veya 0'dan küçük olamaz ! ");
            return new User();
        }
        return this.userDao.getById(id);
    }

    public boolean update(User user) {
        if (user.getId() == 0) {
            return false; // ID'si 0 olan bir kullanıcı güncellenemez.
        }
        User checkUser = this.getById(user.getId());
        if (checkUser == null) {
            return false; // Güncellenmek istenen kullanıcı mevcut değil.
        }
        return this.userDao.update(user);
    }

    public boolean save(User user) {
        return this.userDao.save(user);
    }
    public boolean delete(int id) {
        User checkUser = this.getById(id);
        if (checkUser == null){
            return false;
        }
        return this.userDao.delete(id);
    }

}
