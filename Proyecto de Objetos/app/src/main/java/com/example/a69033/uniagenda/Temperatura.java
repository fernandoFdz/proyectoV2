package com.example.a69033.uniagenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {

    Button convertir=null;
    EditText cantidad=null;
    TextView resultado=null;
    Spinner spiner=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);


    convertir=(Button) findViewById(R.id.btn2);
    cantidad=(EditText) findViewById(R.id.ingresa);
    resultado=(TextView) findViewById(R.id.result);
    spiner=(Spinner) findViewById(R.id.spin);

    String[]op={"Selecciona una opcion","C a F", "F a C"};
        ArrayAdapter<String> adapter= new
                ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        spiner.setAdapter(adapter);

        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cantidad.getText().toString().equals("")) {

                    Toast mag =Toast.makeText(getApplicationContext(),"Escribe una Cantidad",Toast.LENGTH_SHORT);
                    }else{
                    Double c=Double.parseDouble(cantidad.getText().toString());
                    Double res=null;
                    int select=spiner.getSelectedItemPosition();

                    switch (select){
                        case 0:
                            res=0.0;
                            Toast.makeText(getApplicationContext(),"Selecciona una opcion",Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            res = 1.8* c + 32;
                            break;
                        case 2:
                            res = (c-32)/1.8 ;
                            break;
                    }
                    resultado.setText(res.toString());
                }

                }

        });

    }
}
