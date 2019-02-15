package com.khtm.test.hostfragment.host;

import com.khtm.test.hostfragment.common.User;
import com.khtm.test.hostfragment.common.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<User>();

    public void saveUserInfo(String firstName, String lastName, int id) {
        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .id(id).build();
        users.add(user);
    }

    public List<User> getAllUser() {
        return users;
    }
}
