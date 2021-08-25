package com.example.autonomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadPosto extends AppCompatActivity {

    private Button btnAttPrecos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_posto);

        btnAttPrecos = (Button) findViewById(R.id.btnAttPrecos);

        btnAttPrecos.setOnClickListener( new EscutadorBotaoAttPrecos());
    }

    private class EscutadorBotaoAttPrecos implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), AttPrecos.class);
            startActivity(i);
        }
    }
}