package br.com.atividadeareatriangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        EditText base = (EditText) findViewById(R.id.entradaBase);
        EditText altura = (EditText) findViewById(R.id.entradaAltura);

        Double calculo = Double.parseDouble(base.getText().toString())  * Double.parseDouble(altura.getText().toString()) /2;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(calculo.toString());

        altura.setText("");
        base.setText("");
    }
}
