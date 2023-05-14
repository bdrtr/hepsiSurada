package com.example.hepsisurada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.hepsisurada.databinding.ActivityLogInBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLogInBinding logInBinding;
    private String pass_text="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logInBinding = DataBindingUtil.setContentView(this, R.layout.activity_log_in);
        logInBinding.setLoginNesnesi(this);
    }


    public void isTrue() {
        pass_text = pass_text.concat(logInBinding.logScreenUsername.getText().toString()+
                logInBinding.logScreenPassword.getText().toString());
        if (pass_text.equals("")) {
            startActivity(new Intent(this,MainActivity.class));
        }
    }



}