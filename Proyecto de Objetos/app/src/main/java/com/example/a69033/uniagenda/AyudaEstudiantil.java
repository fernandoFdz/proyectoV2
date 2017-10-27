package com.example.a69033.uniagenda;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AyudaEstudiantil extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_estudiantil);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



    }


    public void onClick(View view) {
        Intent cambio = null;


        switch (view.getId()){
            case R.id.button2:
                    cambio= new Intent(AyudaEstudiantil.this , tablaQuimica.class );
                break;
            case R.id.button3:
                    cambio= new Intent(AyudaEstudiantil.this, tablaLogica.class);
                break;
            case R.id.button4:
                    cambio= new Intent(AyudaEstudiantil.this, conversorG.class);
                break;

        } startActivity(cambio);

    }
}

