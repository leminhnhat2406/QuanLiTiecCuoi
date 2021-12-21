package com.qltc.quanlitieccuoi.services;

import com.qltc.quanlitieccuoi.domains.Role;
import com.qltc.quanlitieccuoi.domains.User;

import java.util.List;

public interface UserService {

    User save(User user);

    boolean login(String username, String password);

    boolean checkEmail(String email);

    List<User> findAll();

    User findByEmail(String email);

    User findByUserName(String username);

    User findByUserNameAndPassword(String username,String password);

    User findById(int id);

    int changeAvatar(String image,int id);

    Role findRoleById(int id);

    List<User> getCus();

    List<User> getEm();

    int update(String fullname, String email,String phonenumber, String address, String username, String password, String image, int id);

    int delete(int id);
}
