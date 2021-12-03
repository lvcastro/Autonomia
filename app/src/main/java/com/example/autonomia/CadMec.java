package com.example.autonomia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class CadMec extends AppCompatActivity {
    private DatabaseReference BD = FirebaseDatabase.getInstance().getReference();
    //componentes da interface
    private EditText txtNomeMec,txtEstadoMec,txtCidadeMec,txtBairroMec,txtRuaMec,txtNumeroMec;
    private Button btnEnviarMec, btnCancelarMec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_mec);
        //pegando informação
        txtNomeMec =findViewById(R.id.txtNomeMec);
        txtEstadoMec=findViewById(R.id.txtEstadoMec);
        txtCidadeMec =findViewById(R.id.txtCidadeMec);
        txtBairroMec=findViewById(R.id.txtBairroMec);
        txtRuaMec =findViewById(R.id.txtRuaMec);
        txtNumeroMec=findViewById(R.id.txtRuaPosto);
        btnEnviarMec = (Button) findViewById(R.id.btnEnviarMec);
        btnCancelarMec = (Button) findViewById(R.id.btnCancelarMec);

        btnEnviarMec.setOnClickListener( new CadMec.EscutadorBotaoMec());
    }
    private class EscutadorBotaoMec implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String nome,estado,cidade,bairro,rua,numero;
            ArrayList rating = new ArrayList();
            //Pegando os dados das caixas
            //Não vou tratar por causa do tempo
            nome=txtNomeMec.getText().toString();
            estado=txtEstadoMec.getText().toString();
            cidade=txtCidadeMec.getText().toString();
            bairro=txtBairroMec.getText().toString();
            rua=txtRuaMec.getText().toString();
            numero = txtNumeroMec.getText().toString();
            //Criando obj
            mecanico u =new mecanico( estado, cidade, bairro,  rua,  numero);
            //JSON
            //adicionar no banco
            BD.child("mecanico").child(nome).setValue(u);
        }
    }
}