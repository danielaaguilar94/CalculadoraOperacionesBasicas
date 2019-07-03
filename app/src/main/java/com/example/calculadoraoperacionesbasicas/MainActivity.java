package com.example.calculadoraoperacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText campo1,campo2;
    TextView resultado;
    Button bsuma, bresta,bmult,bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = (EditText) findViewById(R.id.etCampo1);
        campo2 = (EditText) findViewById(R.id.etCampo2);

        bsuma = (Button) findViewById(R.id.btnSuma);
        bresta = (Button) findViewById(R.id.btnResta);
        bmult = (Button) findViewById(R.id.btnMultip);
        bdiv = (Button) findViewById(R.id.btnDiv);

        resultado = (TextView) findViewById(R.id.tvResultado);
        bsuma.setOnClickListener(this);
        bresta.setOnClickListener(this);
        bmult.setOnClickListener(this);
        bdiv.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnSuma:
                sumar();
                break;
            case R.id.btnResta:
                restar();
                break;
            case R.id.btnMultip:
                multiplicar();
                break;
            case R.id.btnDiv:
                dividir();
                break;
                default:
                    break;
        }


    }

    private void dividir() {
        int numero1 = Integer.parseInt(campo1.getText().toString());
        int numero2 = Integer.parseInt(campo2.getText().toString());
        if (numero2>0) {
            int div = numero1 / numero2;
            resultado.setText("El resultado es:" + div);
        }
        else {
            resultado.setText("No se puede realizar division entre 0");
        }
    }

    private void multiplicar() {
        int numero1 = Integer.parseInt(campo1.getText().toString());
        int numero2 = Integer.parseInt(campo2.getText().toString());
        int mult = numero1 * numero2;
        resultado.setText("El resultado es:" +mult);
    }

    private void restar() {
        int numero1 = Integer.parseInt(campo1.getText().toString());
        int numero2 = Integer.parseInt(campo2.getText().toString());
        int resta = numero1 - numero2;
        resultado.setText("El resultado es:" +resta);
    }

    private void sumar() {
        int numero1 = Integer.parseInt(campo1.getText().toString());
        int numero2 = Integer.parseInt(campo2.getText().toString());
        int suma = numero1 + numero2;
        resultado.setText("El resultado es:" +suma);
    }

}
