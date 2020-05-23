package com.example.androidmvp.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements UserI {

    private String emailId;
    private String password;

    public User(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public String getUserID() {
        return emailId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidUser() {
        return !TextUtils.isEmpty(getUserID())&& Patterns.EMAIL_ADDRESS.matcher(getUserID()).matches()
                && getPassword().length()>6;
    }
}
