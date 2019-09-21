package com.worldofuiux.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
/*
*   CREATED BY WORLD OF UI/UX 13/05/2019
*/
public class SignupActivity extends AppCompatActivity {

    LinearLayout lnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        lnLogin=(LinearLayout)findViewById(R.id.lnlogin);
        lnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
