package com.example.solmayra.primerparcial2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Sol Mayra on 18/03/2017.
 */

public class MCDC extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcdl);

        txtnum1 = (EditText) findViewById(R.id.txtnum11);
        txtnum2 = (EditText) findViewById(R.id.txtnum21);
        btncalcular = (Button) findViewById(R.id.btncalcular1);
        txtresultado = (TextView) findViewById(R.id.txtresultado);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resu = obtenerMcd(Integer.parseInt(txtnum1.getText().toString()), Integer.parseInt(txtnum2.getText().toString()));
                txtresultado.setText("El MCD es : "+resu);
            }
        });
    }

    public  int obtenerMcd(int a, int b) {
        if(b==0)
            return a;
        else
            return obtenerMcd(b, a % b);
    }

}
