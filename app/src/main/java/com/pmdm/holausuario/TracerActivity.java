package com.pmdm.holausuario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class TracerActivity extends AppCompatActivity {

    String msg = "Traza";

    /* Cuando se crea la primera vez*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(msg, "Evento onCreate");
    }

    /* Cuando se va a hacer visible*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "Evento onStart");
    }

    /* Cuando ya es visible*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "Evento onResume");
    }

    /* Cuando otra actividad toma el foco*/
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "Evento onPause");
    }

    /* Cuando la actividad deja de ser visible*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "Evento onStop");
    }

    /* Justo antes de ser destruida*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "Evento onDestroy");
    }

}
