package com.khtm.test.hostfragment.common.common;

import java.util.List;

public interface UserService {
    void saveUserInfo(String firstName, String lastName, int id);
    List<User> getAllUser();
}
