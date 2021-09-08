package com.example.autonomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AttPrecos extends AppCompatActivity {

    private Button btnAvalPosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_att_precos);

        btnAvalPosto = (Button) findViewById(R.id.btnAvalPosto);

        btnAvalPosto.setOnClickListener( new AttPrecos.EscutadorBotaoAvalPosto());
    }

    private class EscutadorBotaoAvalPosto implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), AvalPosto.class);
            startActivity(i);
        }
    }
}