package com.exemplo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private EditText editTextResultado;

    private Button buttonSomar;
    private Button buttonSubtrair;
    private Button buttonMultiplicar;
    private Button buttonDividir;

    private Button buttonLimpar;
    private Button buttonFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Associa os componentes da interface aos componentes da classe
        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        editTextResultado = findViewById(R.id.editTextResultado);
        buttonSomar = findViewById(R.id.buttonSomar);
        buttonSubtrair = findViewById(R.id.buttonSubtrair);
        buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        buttonDividir = findViewById(R.id.buttonDividir);
        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonFechar = findViewById(R.id.buttonFechar);

        //Associa os eventos aos componentesvia Listener
        criarListeners();
    }

    private void criarListeners() {
        buttonSomar.setOnClickListener(evt -> onClickButtonSomar());
        buttonSubtrair.setOnClickListener(evt -> onClickButtonSubtrair());
        buttonMultiplicar.setOnClickListener(evt -> onClickButtonMultiplicar());
        buttonDividir.setOnClickListener(evt -> onClickButtonDividir());
        buttonLimpar.setOnClickListener(evt -> onClickButtonLimpar());
        buttonFechar.setOnClickListener(evt -> onClickButtonFechar());
    }

    public void onClickButtonSomar() {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) + Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número 2
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número 1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonSubtrair() {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) - Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número 2
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número 1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonMultiplicar() {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) * Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número 2
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número 1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonDividir() {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) / Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número 2
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número 1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonLimpar() {
        editTextNumero1.setText("");
        editTextNumero2.setText("");
        editTextResultado.setText("");
    }

    public void onClickButtonFechar() {
        System.exit(0);
    }
}