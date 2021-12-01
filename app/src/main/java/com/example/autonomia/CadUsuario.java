package com.example.autonomia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class CadUsuario extends AppCompatActivity {
    private DatabaseReference BD = FirebaseDatabase.getInstance().getReference();
    private EditText txtNomeUsuario,txtEmailUsuario,txtCpfUsuario,txtSenhaUsuario,txtNascimento;
    private Button btnEnviar,btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txtNomeUsuario =findViewById(R.id.txtNomeUsuario);
        txtEmailUsuario=findViewById(R.id.txtEmailUsuario);
        txtCpfUsuario =findViewById(R.id.txtCpfUsuario);
        txtSenhaUsuario=findViewById(R.id.txtSenhaUsuario);
        txtNascimento =findViewById(R.id.txtNascimento);
        btnEnviar.setOnClickListener( new EscutadorBotao());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);

    }
    private class EscutadorBotao implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String nome,senha,email,cpf,nascimento;
            //Pegando os dados das caixas
            //Não vou tratar por causa do tempo
            nome=txtNomeUsuario.getText().toString();
            senha=txtSenhaUsuario.getText().toString();
            email=txtEmailUsuario.getText().toString();
            cpf=txtCpfUsuario.getText().toString();
            nascimento=txtNascimento.getText().toString();
            //Criando obj
            usuario u =new usuario(nome,senha,cpf,nascimento);
            //JSON
            Map<String,usuario> usuarios=new HashMap<>();
            usuarios.put(email,u);
            //adicionar no banco
            BD.child("usuarios").setValue(usuarios);
        }
    }

}

