package com.example.zircle.android_eatit_app;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button signIn, signUp;
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signIn = (Button)findViewById(R.id.btnSignIn);
        signUp = (Button)findViewById(R.id.btnSignUp);

        txtSlogan = (TextView)findViewById(R.id.txtSlogan);
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/NABILA.TFF");
        txtSlogan.setTypeface(face);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // return Sign In Activity
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // return Sign Up Activity
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(MainActivity.this, SignIn.class);
                startActivity(signIn);


            }
        });
    }
}
