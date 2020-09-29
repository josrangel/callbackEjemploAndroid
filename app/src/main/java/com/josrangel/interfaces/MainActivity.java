package com.josrangel.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Animal animal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animal1 = new Animal(new Animal.OnClickAnimal() {
            @Override
            public void selecciona(int posicion) {
                Toast.makeText(MainActivity.this, "posicion"+ posicion, Toast.LENGTH_LONG).show();
            }
        });
    }
}