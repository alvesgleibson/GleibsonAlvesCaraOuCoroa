package br.com.ondanetpe.gleibsonalves_caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
private Button buttonSegunda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSegunda = findViewById(R.id.chamarSegunda);


        buttonSegunda.setOnClickListener(new View.OnClickListener() {

          @Override
            public void onClick(View view) {

              Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
              int numeroR = new Random().nextInt(2);
              i.putExtra("numero",numeroR);
              startActivity(i);

            }
        });




    }
}
