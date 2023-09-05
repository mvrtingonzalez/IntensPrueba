package com.example.intensprueba;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        // Recupera el nombre del usuario de los extras del Intent
        String nombreUsuario = getIntent().getStringExtra("nombreUsuario");

        // Muestra el nombre del usuario en el TextView
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Bienvenido al sistema, " + nombreUsuario);
    }


}