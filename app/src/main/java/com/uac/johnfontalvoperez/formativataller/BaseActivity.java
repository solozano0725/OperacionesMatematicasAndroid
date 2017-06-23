package com.uac.johnfontalvoperez.formativataller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    EditText edt_numero;
    Button button_calcular;
    TextView textView_res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        edt_numero = (EditText) findViewById(R.id.edt_numero);
        button_calcular = (Button) findViewById(R.id.button_calcular);
        textView_res = (TextView) findViewById(R.id.textView_res);

        Spinner s = (Spinner) findViewById(R.id.spinner2);
        s.setOnItemSelectedListener(this);
        List<String> bases = new ArrayList<String>();
        bases.add("Binario");
        bases.add("Hexadecimal");
        bases.add("Octal");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bases);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter);


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        final String item = parent.getItemAtPosition(position).toString();

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (item == "Binario"){
                    int x = Integer.parseInt(edt_numero.getText().toString());
                    String bin = Integer.toBinaryString(x);
                    textView_res.setText(bin);
                }
                else{
                    if (item == "Hexadecimal"){
                        int x = Integer.parseInt(edt_numero.getText().toString());
                        String hex = Integer.toHexString(x);
                        textView_res.setText(hex);
                    }
                    else{
                        int x = Integer.parseInt(edt_numero.getText().toString());
                        String oct = Integer.toOctalString(x);
                        textView_res.setText(oct);
                    }
                }


            }
        });


    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }}


