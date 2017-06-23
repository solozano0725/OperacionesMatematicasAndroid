package com.uac.johnfontalvoperez.formativataller;

import android.renderscript.Double2;
import android.renderscript.Int2;
import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempActivity extends AppCompatActivity {

    EditText temp;
    TextView resultado;
    RadioButton f, k, r;
    Button btnconvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        temp = (EditText) findViewById(R.id.id_temp);
        resultado = (TextView) findViewById(R.id.txtresultado);
        f = (RadioButton) findViewById(R.id.id_faren);
        k = (RadioButton) findViewById(R.id.id_kelv);
        r = (RadioButton) findViewById(R.id.id_rank);
        btnconvertir = (Button) findViewById(R.id.btn_convertir);


        btnconvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(temp.getText().length()==0){
                    Toast.makeText(TempActivity.this, "No ingresastes temperatura a convertir.", Toast.LENGTH_SHORT).show();
                } else{
                    Double x = Double.parseDouble(temp.getText().toString());
                    if(f.isChecked()){
                        Double a = x*1.8;
                        resultado.setText(Double.toString((a+32)) + "°F");
                    }else if(k.isChecked()){
                        resultado.setText(Double.toString(((x+273.15)))+" °K");
                    } else if (r.isChecked()){
                        Double n = x*1.8000;
                        resultado.setText(Double.toString(n+491.67)+" °R");
                    } else{
                        Toast.makeText(TempActivity.this, "No escogio la temperatura deseada a convertir.", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}
