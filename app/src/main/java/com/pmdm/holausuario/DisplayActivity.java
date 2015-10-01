package com.pmdm.holausuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayActivity extends TracerActivity {

    public DisplayActivity(){
        super();
        this.msg = "TrazaDisplayActivity";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //referencia
        TextView lblSaludo = (TextView) findViewById(R.id.LblSaludo);
        //recuperar info
        Bundle bundle = this.getIntent().getExtras();
        //mostrar mensaje
        lblSaludo.setText("Hola "+bundle.getString("NOMBRE"));
    }

    @Override
    protected void onPause(){
        super.onPause();
        //cerrar esta actividad
        DisplayActivity.this.finish();
    }
}
