package com.example.pantalla1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private EditText edtNombre, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btnIngresar);
        edtNombre = findViewById(R.id.edtNombre);
        edtPass = findViewById(R.id.edtPass);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ingresar();
            }
        });

    }

    private void ingresar(){

        String user = edtNombre.getText().toString();
        String pass = edtPass.getText().toString();

        if(user.equals("ites") && pass.equals("1234")){
            Toast.makeText(this, "acceso válido", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "acceso no permitido", Toast.LENGTH_SHORT).show();
        }
        
    }
}

