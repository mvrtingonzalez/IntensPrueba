package com.example.intensprueba;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresarSistema(View view) {
        //Me manda a la clase login
        Intent actividad = new Intent(this, login.class);
        startActivity(actividad);
    }
}