package com.example.solmayra.primerparcial2017;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

/**
 * Created by Sol Mayra on 18/03/2017.
 */

public class Adivina extends AppCompatActivity {
    Button btnjugar;
    TextView txtinfo, txtganar;
    EditText txtnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adivina);

        btnjugar = (Button) findViewById(R.id.btnjugar);
        txtinfo = (TextView) findViewById(R.id.txtinfo);
        txtganar = (TextView) findViewById(R.id.txtganar);
        txtnum = (EditText) findViewById(R.id.txtnumero);

        btnjugar.setOnClickListener(new View.OnClickListener() {
            Random rm = new Random();
            int ran = rm.nextInt(100 - 1) + 1;
            int n = Integer.parseInt(txtnum.getText().toString());
            @Override
            public void onClick(View v) {
                btnjugar.setText("INTENTAR");
                for (int i = 5; i > 0; i--) {
                    if (ran > n) {
                        txtinfo.setText("El numero que ingresastes es menor. Te quedan " + i + " intentos.");
                    } else if (ran < n) {
                        txtinfo.setText("El numero que ingresastes es mayor. Te quedan " + i + " intentos.");
                    } else if (i == 0) {
                        txtganar.setText("L O S E R .");
                        txtinfo.setText("");
                        btnjugar.setText("LOSER");
                    } else {
                        txtinfo.setText("");
                        txtganar.setText("W I N N E R .");
                    }
                }
            }
        });
    }

}
