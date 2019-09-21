package com.worldofuiux.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
/*
*   CREATED BY WORLD OF UI/UX 13/05/2019
*/
public class LoginActivity extends AppCompatActivity {

    LinearLayout lnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lnRegister = (LinearLayout) findViewById(R.id.lnreg);
        lnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
                finish();
            }
        });
    }
}
