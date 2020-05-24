package com.example.androidmvp.Presenter;

import com.example.androidmvp.Interface.ILoginPresenter;
import com.example.androidmvp.Interface.ILoginView;
import com.example.androidmvp.Model.User;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }


    @Override
    public void isLogin(String email, String password) {
        User user = new User(email, password);
        boolean isLoginSuccess = user.isValidUser();

        if(isLoginSuccess){
            loginView.OnLoginResult("Login Success");
            loginView.openMainActivity();
        }else{
            loginView.OnLoginResult("Logn Failed");

        }
    }
}
