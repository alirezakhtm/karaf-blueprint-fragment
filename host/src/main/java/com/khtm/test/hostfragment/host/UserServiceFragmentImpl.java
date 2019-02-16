package com.khtm.test.hostfragment.host;

import com.khtm.test.hostfragment.common.common.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceFragmentImpl implements com.khtm.test.hostfragment.common.common2.UserServiceFragment {

    private static List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }
}
