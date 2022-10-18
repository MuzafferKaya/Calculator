package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public int value, result;
public String process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtNumber = findViewById(R.id.txtNumber);
        TextView lblNumber = findViewById(R.id.lblNumber);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnArti = findViewById(R.id.btnArti);
        Button btnEksi = findViewById(R.id.btnEksi);
        Button btnCarpma = findViewById(R.id.btnCarpma);
        Button btnBolme = findViewById(R.id.btnBolme);
        Button btnEşittir = findViewById(R.id.btnEşittir);
        Button btnClear = findViewById(R.id.btnClear);

        lblNumber.setText("");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText(txtNumber.getText() + "9");
            }
        });
        btnArti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = "+";
                value = Integer.parseInt(txtNumber.getText().toString());
                txtNumber.setText("");
            }
        });
        btnEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = "-";
                value = Integer.parseInt(txtNumber.getText().toString());
                txtNumber.setText("");
            }
        });
        btnCarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = "*";
                value = Integer.parseInt(txtNumber.getText().toString());
                txtNumber.setText("");
            }
        });
        btnBolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = "/";
                value = Integer.parseInt(txtNumber.getText().toString());
                txtNumber.setText("");
            }
        });
        btnEşittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(process == "+"){
                    result = value + Integer.parseInt(txtNumber.getText().toString());
                    lblNumber.setText(lblNumber.getText() + ", " + result);
                }
                else if(process == "-"){
                    result = value - Integer.parseInt(txtNumber.getText().toString());
                    lblNumber.setText(lblNumber.getText() + ", " + result);
                }
                else if(process == "/"){
                    result = value / Integer.parseInt(txtNumber.getText().toString());
                    lblNumber.setText(lblNumber.getText() + ", " + result);
                }
                else if(process == "*"){
                    result = value * Integer.parseInt(txtNumber.getText().toString());
                    lblNumber.setText(lblNumber.getText() + ", " + result);
                }
                txtNumber.setText("");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNumber.setText("");
            }
        });

    }
}