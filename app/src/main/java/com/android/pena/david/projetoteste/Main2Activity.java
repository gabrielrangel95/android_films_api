package com.android.pena.david.projetoteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView categoriaObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        categoriaObj = (TextView) findViewById(R.id.categoria_name);

        //Adiciona backbutton para voltar para o pai
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //pega a string que veio da intenção
        String obj = getIntent().getStringExtra("CATEGORIA_TAG");

        if(obj != null){
            categoriaObj.setText(obj);
        }

    }
}
