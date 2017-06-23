package com.uac.johnfontalvoperez.formativataller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperacionesActivity extends AppCompatActivity {

    EditText edt_Num1, edt_num2;
    Button btn_potencia, btn_maxmin, btn_mcm;
    TextView tw_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);

        edt_Num1 = (EditText) findViewById(R.id.edt_Num1);
        edt_num2 = (EditText) findViewById(R.id.edt_num2);
        tw_resultado = (TextView) findViewById(R.id.tw_Resultado);
        btn_potencia = (Button) findViewById(R.id.btn_potencia);
        btn_maxmin = (Button) findViewById(R.id.btn_maxmin);
        btn_mcm = (Button) findViewById(R.id.btn_mcm);

        btn_potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double x = Math.pow(Double.parseDouble(edt_Num1.getText().toString()), Double.parseDouble(edt_num2.getText().toString()));

                tw_resultado.setText(x.toString());
            }
        });

        btn_maxmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Double.parseDouble(edt_Num1.getText().toString()) > Double.parseDouble(edt_num2.getText().toString())){
                    Double x = Double.parseDouble(edt_Num1.getText().toString());
                    tw_resultado.setText(x.toString());
                }
                else{
                    Double x = Double.parseDouble(edt_num2.getText().toString());
                    tw_resultado.setText(x.toString());
                }


            }
        });

        btn_mcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int mcm=1;
                int i=2;
                Double num1 = Double.parseDouble(edt_Num1.getText().toString());
                Double num2 = Double.parseDouble(edt_num2.getText().toString());
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

                tw_resultado.setText(Integer.toString(mcm));


        }
        });



    }
}
