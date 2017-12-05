package br.com.ondanetpe.gleibsonalves_caraoucoroa;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SegundaActivity extends AppCompatActivity {

    private Button imageButtonSegunda;
    private ImageView mudar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imageButtonSegunda = findViewById(R.id.chamarPrimeira);
        mudar = findViewById(R.id.imagenMuda);

        //Recuperar Dados
        Bundle bundleGet = getIntent().getExtras();
        int recebe = bundleGet.getInt("numero");


        if(recebe == 0){
            mudar.setImageResource(R.drawable.moeda_cara);
        }else{
            mudar.setImageResource(R.drawable.moeda_coroa);


        }



        imageButtonSegunda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }




}
