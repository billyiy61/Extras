package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

    EditText txtLName;
    EditText txtFName;

    Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFName = findViewById(R.id.txtFName);
        txtLName = findViewById(R.id.txtLName);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("fname", txtFName.getText().toString());
        intent.putExtra("lname", txtLName.getText().toString());
        startActivity(intent);
    }
}
