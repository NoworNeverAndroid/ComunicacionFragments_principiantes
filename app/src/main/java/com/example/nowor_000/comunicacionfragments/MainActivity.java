package com.example.nowor_000.comunicacionfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void responder(String datos) {//los textoGuardado recibidos son el numero de clicks
        android.app.FragmentManager fragmentManager = getFragmentManager();
        //android.app.Fragment fragmentB =(FragmentB) fragmentManager.findFragmentById(R.id.fragmentB_element);
        FragmentB fragmentb=(FragmentB) fragmentManager.findFragmentById(R.id.fragmentB_element);
        fragmentb.cambiarTexto(datos);

        }

    }

