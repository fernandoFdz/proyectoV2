package com.example.a69033.uniagenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class conversorG extends AppCompatActivity {

    Button temperatura=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_g);

        temperatura=(Button)findViewById(R.id.btn1);
        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambio = new Intent(getApplicationContext(),Temperatura.class);
                startActivity(cambio);
            }
        });
    }
}
