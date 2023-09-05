package com.example.intensprueba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class login extends AppCompatActivity {
    private EditText nombreEditText;
    private Button enviarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Asocia los elementos de la interfaz de usuario con las variables
        nombreEditText = findViewById(R.id.idNombre);
        enviarButton = findViewById(R.id.button2);

        //aqui se llama al metodo enviarFormulario al hacer click en el boton
        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarFormulario();
            }
        });
    }
    private void enviarFormulario() {
        //Aca recuperamos el nombre ingresado en el EditText
        String nombreUsuario = nombreEditText.getText().toString();
        if (!nombreUsuario.isEmpty()) {
            String mensaje = "Hola, " + nombreUsuario + "! Tus datos han sido enviados.";
            //Aca muestra un mensaje emergente
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();

            // Inicia la activity2 y pasa el nombre como dato extra
            Intent intent = new Intent(this, activity2.class);
            intent.putExtra("nombreUsuario", nombreUsuario);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Por favor, ingresa tu nombre.", Toast.LENGTH_SHORT).show();
        }
    }
}
