package com.uac.johnfontalvoperez.formativataller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_Usuario, edt_pass;
    Button btn_Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_Usuario = (EditText) findViewById(R.id.edt_Usuario);
        edt_pass = (EditText) findViewById(R.id.edt_pass);
        btn_Ingresar = (Button) findViewById(R.id.btn_ingresar);

        btn_Ingresar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edt_Usuario.getText().toString().equals("admin") && edt_pass.getText().toString().equals("admin"))
                {
                    Ingresar();
                }
            }
        });

}

    public void Ingresar(){
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }


}
