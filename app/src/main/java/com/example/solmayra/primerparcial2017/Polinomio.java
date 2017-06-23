package com.example.solmayra.primerparcial2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sol Mayra on 18/03/2017.
 */

public class Polinomio extends AppCompatActivity {

    EditText a, b, c;
    TextView res;
    Button btncalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polimonio);

        a = (EditText) findViewById(R.id.txta);
        b = (EditText) findViewById(R.id.txtb);
        c = (EditText) findViewById(R.id.txtc);
        res = (TextView) findViewById(R.id.txtresultado);
        btncalcular = (Button) findViewById(R.id.btncalcular1);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.getText().length() != 0 || b.getText().length() != 0 || c.getText().length() != 0){
                    int aa = Integer.parseInt(a.getText().toString());
                    int bb = Integer.parseInt(b.getText().toString());
                    int cc = Integer.parseInt(c.getText().toString());
                    if(bb*bb<4*aa*cc){
                        res.setText("Solucion perteneciente al campo de los numeros complejos.");
                    }
                    else if(aa!=0&&bb*bb>4*aa*cc){
                        res.setText("La primera solucion es "+(-bb+Math.sqrt(bb*bb-4*aa*cc))/(2*aa)+"\nLa segunda solucion es "+(-bb-Math.sqrt(bb*bb-4*aa*cc))/(2*aa));
                    }
                    else {
                        res.setText("Esta ecuacion no es de segundo grado.");
                    }
                } else{
                    res.setText("");
                    Toast.makeText(Polinomio.this, "No ingresastes alguno de los campos requeridos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
