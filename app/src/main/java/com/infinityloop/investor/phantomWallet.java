package com.infinityloop.investor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class phantomWallet extends AppCompatActivity {
    TextView cancel, connect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phantom_wallet);

        cancel = (TextView) findViewById(R.id.cancel);
        connect = (TextView) findViewById(R.id.connect);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(phantomWallet.this, LoginPage.class);
                startActivity(i);
            }
        });

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(phantomWallet.this, Portfolio.class);
                startActivity(i);
            }
        });


    }
}