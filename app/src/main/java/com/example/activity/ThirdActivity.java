package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends Activity implements OnClickListener {

    EditText txtCountry;
    EditText txtCity;

    Button btnSubmit;

    String fName, lName, Age, Birthday;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtCountry = findViewById(R.id.txtCountry);
        txtCity = findViewById(R.id.txtCity);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
        Age =  getIntent().getStringExtra("Age");
        Birthday = getIntent().getStringExtra("Birthday");

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, FourActivity.class);
        intent.putExtra("Country", txtCountry.getText().toString());
        intent.putExtra("City", txtCity.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        intent.putExtra("Age", Age);
        intent.putExtra("Birthday", Birthday);
        startActivity(intent);
    }
}
