package pe.merkur92.empleados.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import pe.merkur92.empleados.R;

public class DetailActivity extends AppCompatActivity {
    TextView fullnameTxt, cargoTxt, emailTxt;
    ImageButton telefonoBtn;
    String fullname, cargo, email, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        fullname = intent.getStringExtra("fullname");
        cargo = intent.getStringExtra("cargo");
        email = intent.getStringExtra("email");
        telefono = intent.getStringExtra("telefono");

        fullnameTxt = findViewById(R.id.fullnameTxt);
        cargoTxt = findViewById(R.id.cargoTxt);
        emailTxt = findViewById(R.id.emailTxt);
        telefonoBtn = findViewById(R.id.phoneBtn);

        fullnameTxt.setText(fullname);
        cargoTxt.setText(cargo);
        emailTxt.setText(email);

        telefonoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamar();
            }
        });


    }

    private void llamar() {

        if( telefono.isEmpty() ){
            Toast.makeText(this, "Actualizar el número", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + telefono));

        startActivity(intent);
    }
}
