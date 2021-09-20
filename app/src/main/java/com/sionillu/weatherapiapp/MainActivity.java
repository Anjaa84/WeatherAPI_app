package com.sionillu.weatherapiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCityId,btnWeatherById,btnWeatherByName;
    EditText  editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText   = findViewById(R.id.editText);

        btnCityId = findViewById(R.id.btn_getCityById);
        btnWeatherById = findViewById(R.id.btn_getWeatherByCityId);
        btnWeatherByName = findViewById(R.id.btn_getCityByName);

        btnCityId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"1st",Toast.LENGTH_SHORT).show();

            }
        });

        btnWeatherById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"2nd",Toast.LENGTH_SHORT).show();


            }
        });

        btnWeatherByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Type:"+editText.getText().toString(),Toast.LENGTH_SHORT).show();


            }
        });



    }
}