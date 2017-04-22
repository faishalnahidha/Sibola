package com.sibola.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


    }


    public void goToActivitySignUp (View view){
        startActivity(new Intent (this, SignUpActivity.class));

    }

    public void goToActivityHome(View view){
        startActivity(new Intent(this, HomeActivity.class));
    }

}
