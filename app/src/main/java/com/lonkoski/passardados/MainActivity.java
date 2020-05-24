package com.lonkoski.passardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent =new Intent( getApplicationContext(), SegundaActivity.class );


              //instanciar objeto
                Usuario usuario=new Usuario("Douglas", "douglaslonkoski6@hotmail.com");

              intent.putExtra("nome", "Douglas Lonkoski");
              intent.putExtra("idade",  21);
              intent.putExtra("objeto", usuario );
              //chamar outra activity
              startActivity(intent);
            }
        });
    }
}




















