package com.example.autonomia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CadPosto extends AppCompatActivity {
    //BANCO
    private DatabaseReference BD = FirebaseDatabase.getInstance().getReference();
    //NAVEGAÇÃO
    private Button btnAttPrecos;
    private Button btnAvalPosto;
    private Button btnAvalMec;
    private Button btnCadMec;
    private Button btnCadUsuario;
    //OBJ INTERFACE
    private EditText txtNomePosto,txtEstadoPosto,txtCidadePosto,txtBairroPosto,txtRuaPosto,txtNumeroPosto,txtOutro;
    private Button btnEnviarPosto,btnCancelarPosto;
    private CheckBox cbLava,cbLoja,cbMercado,cbBorracharia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_posto);
        //Nav
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
        //Pegando dados;
        txtNomePosto =findViewById(R.id.txtNomePosto);
        txtEstadoPosto=findViewById(R.id.txtEstadoPosto);
        txtCidadePosto =findViewById(R.id.txtCidadePosto);
        txtBairroPosto=findViewById(R.id.txtBairroPosto);
        txtRuaPosto =findViewById(R.id.txtRuaPosto);
        txtNumeroPosto=findViewById(R.id.txtNumeroPosto);
        txtNumeroPosto=findViewById(R.id.txtOutro);
        cbLava=findViewById(R.id.cbLava);
        cbLoja=findViewById(R.id.cbLoja);
        cbMercado=findViewById(R.id.cbMercado);
        cbBorracharia=findViewById(R.id.cbBorracharia);;

        btnEnviarPosto = (Button) findViewById(R.id.btnEnviarPosto);
        btnCancelarPosto = (Button) findViewById(R.id.btnCancelarPosto);

        btnEnviarPosto.setOnClickListener( new CadPosto.EscutadorBotaoPosto());
    }
    private class EscutadorBotaoPosto implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String nome,estado,cidade,bairro,rua,numero,outro;
            String lava = "";String loja = "";String mercado = "";String borracharia = "";
            nome=txtNomePosto.getText().toString();
            estado=txtEstadoPosto.getText().toString();
            cidade=txtCidadePosto.getText().toString();
            bairro=txtBairroPosto.getText().toString();
            rua=txtRuaPosto.getText().toString();
            numero = txtNumeroPosto.getText().toString();
            if(cbLava.isChecked()){
                lava=cbLava.getText().toString();
            }
            if(cbLoja.isChecked()){
                loja=cbLoja.getText().toString();
            }
            if(cbBorracharia.isChecked()){
                borracharia=cbBorracharia.getText().toString();
            }
            if(cbMercado.isChecked()){
                mercado=cbMercado.getText().toString();
            }
            outro=txtOutro.getText().toString();
            //Criando obj posto
            posto u = new posto(  nome,   estado,   cidade,   bairro,   rua,   numero);
            //Obj Servico
            servico s = new servico(lava,loja,mercado,borracharia,outro);
            //enviando
            BD.child("posto").child(nome).setValue(u);
            BD.child(nome).child("serviços").setValue(s);
        }
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