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

public class MCMC extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView txtresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mcml);
        txtnum1 = (EditText) findViewById(R.id.txtnum11);
        txtnum2 = (EditText) findViewById(R.id.txtnum22);
        btncalcular = (Button) findViewById(R.id.btncalcular2);
        txtresultado = (TextView) findViewById(R.id.txtresultado2);


        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resu = obtenerMcm(Integer.parseInt(txtnum1.getText().toString()), Integer.parseInt(txtnum2.getText().toString()));
                txtresultado.setText("El MCM es : "+resu);
            }
        });


    }

    public int obtenerMcm(int num1, int num2) {
        int mcm=1, i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
                mcm=mcm*i;
                if(num1%i==0) num1=num1/i;
                if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;
        }
        return mcm;
    }

}
