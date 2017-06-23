package com.uac.johnfontalvoperez.formativataller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btn_operaciones, btn_temperatura, btn_base, btn_galeria, btn_acerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_operaciones = (Button) findViewById(R.id.btn_Operaciones);
        btn_temperatura = (Button) findViewById(R.id.btn_temperatura);
        btn_base = (Button) findViewById(R.id.btn_base);
        btn_galeria = (Button) findViewById(R.id.btn_galeria);
        btn_acerca = (Button) findViewById(R.id.btn_acerca);

        Intent i;

        btn_operaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity(OperacionesActivity.class);
            }
        });

        btn_temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity(TempActivity.class);
            }
        });

        btn_base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity(BaseActivity.class);
            }
        });

        btn_galeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity(GaleriaActivity.class);
            }
        });

        btn_acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirActivity(AcercaActivity.class);
            }
        });
    }

    public void AbrirActivity(Class activity)
    {
        Intent i=new Intent(this, activity);
        startActivity(i);
    }



}
