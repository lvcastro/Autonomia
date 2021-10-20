package com.example.autonomia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CadPosto extends AppCompatActivity {

    private Button btnAttPrecos;
    private Button btnAvalPosto;
    private Button btnAvalMec;
    private Button btnCadMec;
    private Button btnCadUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_posto);

        btnAttPrecos = (Button) findViewById(R.id.btnAttPrecos);
        btnAvalPosto = (Button) findViewById(R.id.btnAvalPosto);
        btnAvalMec = (Button) findViewById(R.id.btnAvalMec);
        btnCadMec = (Button) findViewById(R.id.btnCadMec);
        btnCadUsuario = (Button) findViewById(R.id.btnCadUsuario);

        btnAttPrecos.setOnClickListener( new EscutadorBotaoAttPrecos());
        btnAvalPosto.setOnClickListener( new EscutadorBotaoAvalPosto());
        btnAvalMec.setOnClickListener( new EscutadorBotaoAvalMec());
        btnCadMec.setOnClickListener( new EscutadorBotaoCadMec());
        btnCadUsuario.setOnClickListener( new EscutadorBotaoCadUsuario());
    }

    private class EscutadorBotaoAttPrecos implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), AttPrecos.class);
            startActivity(i);
        }
    }

    private class EscutadorBotaoAvalPosto implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), AvalPosto.class);
            startActivity(i);
        }
    }

    private class EscutadorBotaoAvalMec implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), AvalMec.class);
            startActivity(i);
        }
    }

    private class EscutadorBotaoCadMec implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), CadMec.class);
            startActivity(i);
        }
    }

    private class EscutadorBotaoCadUsuario implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent i = new Intent( getApplicationContext(), CadUsuario.class);
            startActivity(i);
        }
    }
}