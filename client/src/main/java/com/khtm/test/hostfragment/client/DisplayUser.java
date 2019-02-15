package com.khtm.test.hostfragment.client;

import com.khtm.test.hostfragment.common.User;
import com.khtm.test.hostfragment.common.UserService;
import lombok.Data;

import java.util.Iterator;

@Data
public class DisplayUser {

    private UserService userService;

    public void init(){
        userService.saveUserInfo("alireza", "khatami doost", 1);
        userService.saveUserInfo("majid", "vakili", 2);
        userService.saveUserInfo("morteza", "mosavi", 3);
        displayAllUser();
    }

    private void displayAllUser(){
        userService.getAllUser().forEach((user)-> System.out.println(user.toString()));
    }

}
