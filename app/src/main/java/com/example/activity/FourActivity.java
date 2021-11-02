package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FourActivity extends Activity implements OnClickListener {

    EditText txtTelephone;
    EditText txtModel;

    Button btnSubmit;

    String fName, lName, Age, Birthday, Country, City;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txtTelephone = findViewById(R.id.txtTelephone);
        txtModel = findViewById(R.id.txtModel);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
        Age =  getIntent().getStringExtra("Age");
        Birthday = getIntent().getStringExtra("Birthday");
        Country = getIntent().getStringExtra("Country");
        City = getIntent().getStringExtra("City");

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, FinallyActivity.class);
        intent.putExtra("Email", txtTelephone.getText().toString());
        intent.putExtra("Password", txtModel.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        intent.putExtra("Age", Age);
        intent.putExtra("Birthday", Birthday);
        intent.putExtra("Country", Country);
        intent.putExtra("City", City);
        startActivity(intent);
    }
}

