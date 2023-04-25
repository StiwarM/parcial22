package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private TextView resultado_final;
    private EditText ingresar_num;

    private Button b_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado_final = findViewById(R.id.resultado);

        ingresar_num = findViewById(R.id.ingresar);

        b_calcular = findViewById(R.id.btn_calcular);

        b_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado_final.setText(Fibonacci(Integer.parseInt(ingresar_num.getText().toString())) + "");
            }
        });

        ingresar_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado_final.setText(Fibonacci(Integer.parseInt(ingresar_num.getText().toString())) + "");
            }
        });




    }

    public int Fibonacci(int a) {

        return a;
    }
}



