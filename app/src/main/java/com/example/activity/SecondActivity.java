package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements OnClickListener {

    EditText txtAge;
    EditText txtBirthday;

    Button btnSubmit;

    String fName, lName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtAge = findViewById(R.id.txtAge);
        txtBirthday = findViewById(R.id.txtBirthday);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("Age", txtAge.getText().toString());
        intent.putExtra("Birthday", txtBirthday.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        startActivity(intent);
    }
}
