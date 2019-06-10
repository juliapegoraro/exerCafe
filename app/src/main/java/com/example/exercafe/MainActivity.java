package com.example.exercafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.botao);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

              //  Toast.makeText(v.getContext(), "test", Toast.LENGTH_SHORT).show();

                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.setType("*/*");
                sendEmail.putExtra(Intent.EXTRA_EMAIL, "juliapegoraro43@gmail.com");
                sendEmail.putExtra(Intent.EXTRA_TEXT, "ola");
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Cafe");

                if (sendEmail.resolveActivity(getPackageManager()) != null){
                    startActivity(sendEmail);
                    Log.i( "OnClick", "enviei :");

                }
                Log.i("Onclick", "botao pressionado");
            }
        });
    }
}
