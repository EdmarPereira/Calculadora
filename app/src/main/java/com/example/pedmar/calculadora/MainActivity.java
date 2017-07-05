package com.example.pedmar.calculadora;

import android.renderscript.Double2;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.app.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    Button btnSomar, btnMultiplicar, btnDividir, btnSubtrair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);



        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble( edtNum1.getText().toString());
                double num2 = Double.parseDouble( edtNum2.getText().toString());
                double resultado = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("O resultado da soma é ");
                dialogo.setMessage("A soma é " + resultado);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble( edtNum1.getText().toString());
                double num2 = Double.parseDouble( edtNum2.getText().toString());
                double resultado = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("O resultado da subtração é ");
                dialogo.setMessage("A subtração é " + resultado);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble( edtNum1.getText().toString());
                double num2 = Double.parseDouble( edtNum2.getText().toString());
                double resultado = num1 * num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("O resultado da multiplicação é ");
                dialogo.setMessage("A multiplicação é " + resultado);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble( edtNum1.getText().toString());
                double num2 = Double.parseDouble( edtNum2.getText().toString());
                double resultado = num1 / num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("O resultado da divisão é ");
                dialogo.setMessage("A divisão é " + resultado);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });








    }


}
