package com.example.solmayra.primerparcial2017;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();
    Button btnmcm, btnmcd, btnadivinar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnadivinar = (Button) findViewById(R.id.btnadivinar);
        btnmcm = (Button) findViewById(R.id.btnmcm);
        btnmcd = (Button) findViewById(R.id.btnmcd);

        btnadivinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar(Adivina.class);
            }
        });

        btnmcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar(MCMC.class);
            }
        });

        btnmcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresar(MCDC.class);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.idcolor:
                findViewById(R.id.content_main).setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                return true;
            case R.id.idpolinomio:
                ingresar(Polinomio.class);
                return true;
            case R.id.idacerca:
                ingresar(Acerca.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void ingresar(Class c){
        Intent i = new  Intent(getApplicationContext(), c);
        startActivity(i);
    }
}
