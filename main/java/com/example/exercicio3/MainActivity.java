package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText nome1;
    EditText nome2;
     public void acessar(View view){

        nome1 = findViewById(R.id.txtnome1);
        nome2 = findViewById(R.id.txtnome2);

        String string1 = nome1.getText().toString();
        String string2 = nome2.getText().toString();

        String string3 = string1 + " " + string2;


         if( string1.isEmpty() || string2.isEmpty()){
             Toast.makeText(MainActivity.this,"Nome não inserido",Toast.LENGTH_LONG ).show();
         }else{
             Toast.makeText(MainActivity.this,"óla " +string3 ,Toast.LENGTH_LONG ).show();
         }

     }
}