package com.example.androidmvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidmvc.R;
import com.example.androidmvp.Interface.ILoginPresenter;
import com.example.androidmvp.Interface.ILoginView;
import com.example.androidmvp.Presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    EditText edt_uderId,edt_pass;
    Button btn_login;

    ILoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_uderId= findViewById(R.id.emailID);
        edt_pass= findViewById(R.id.pass);
        btn_login= findViewById(R.id.login);

        loginPresenter = new LoginPresenter(this);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.isLogin(edt_uderId.getText().toString(),edt_pass.getText().toString());
            }
        });
    }

    @Override
    public void OnLoginResult(String result) {
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void openMainActivity() {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
