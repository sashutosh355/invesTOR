package com.infinityloop.investor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {
    ConstraintLayout l1,l2,l3,l4,l5,l6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        l1 = (ConstraintLayout) findViewById(R.id.constraintLayout);
        l2 = (ConstraintLayout) findViewById(R.id.constraintLayout2);
        l3 = (ConstraintLayout) findViewById(R.id.constraintLayout3);
        l4 = (ConstraintLayout) findViewById(R.id.constraintLayout4);
        l5 = (ConstraintLayout) findViewById(R.id.constraintLayout5);
        l6 = (ConstraintLayout) findViewById(R.id.constraintLayout6);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Portfolio.class);
                startActivity(i);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Portfolio.class);
                startActivity(i);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, phantomWallet.class);
                startActivity(i);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Portfolio.class);
                startActivity(i);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Portfolio.class);
                startActivity(i);
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Portfolio.class);
                startActivity(i);
            }
        });
    }
}