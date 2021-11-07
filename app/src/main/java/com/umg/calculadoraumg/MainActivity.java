package com.umg.calculadoraumg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResuldado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float numero3 = 0.0f;
    float resultado = 0.0f;

    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResuldado = findViewById(R.id.tvResultado);
    }

    public void Info(View view) {
        Intent i = new Intent(this, Info.class);
        startActivity(i);

        tvResuldado = findViewById(R.id.tvResultado);
    }

    public void EscribirCero(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if(numero1 == 0.0f){
            tvResuldado.setText("0");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "0");
        }
    }

    public void EscribirUno(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if(numero1 == 0.0f){
            tvResuldado.setText("1");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("2");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("3");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("4");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("5");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("6");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("7");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("8");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        if (numero1 == 0.0f) {
            tvResuldado.setText("9");
        } else {
            tvResuldado.setText(tvResuldado.getText() + "9");
        }
    }

    public void punto(View view) {
        numero1 = Float.parseFloat(tvResuldado.getText().toString());

        if(numero1 == 0.0f){
            tvResuldado.setText("0");
        } else {
            String punto = tvResuldado.getText().toString();
            tvResuldado.setText(punto + ".");
        }
    }

    public void LimpiarPantalla(View view) {
        tvResuldado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void OperacionMulti(View view) {
        numero3 = Float.parseFloat(tvResuldado.getText().toString());
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        operacion = "*";
        tvResuldado.setText("0");

    }

    public void OperacionDividir(View view) {
        numero3 = Float.parseFloat(tvResuldado.getText().toString());
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        operacion = "/";
        tvResuldado.setText("0");
    }

    public void OperacionSuma(View view) {
        numero3 = Float.parseFloat(tvResuldado.getText().toString());
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        operacion = "+";
        tvResuldado.setText("0");
    }

    public void OperacionResta(View view) {
        numero3 = Float.parseFloat(tvResuldado.getText().toString());
        numero1 = Float.parseFloat(tvResuldado.getText().toString());
        operacion = "-";
        tvResuldado.setText("0");
    }

    public void Operaciones(View view) {
        numero2 = Float.parseFloat(tvResuldado.getText().toString());

        if (operacion.equals("+")) {

            resultado = numero3 + numero2;
            tvResuldado.setText(resultado + "");


        } else if (operacion.equals("-")) {

            resultado = numero3 - numero2;
            tvResuldado.setText(resultado + "");


        } else if (operacion.equals("*")) {

            resultado = numero3 * numero2;
            tvResuldado.setText(resultado + "");

        } else if (operacion.equals("/")) {

            resultado = numero3 / numero2;
            tvResuldado.setText(resultado + "");

        }
    }
}