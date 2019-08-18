package pe.merkur92.empleados.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import pe.merkur92.empleados.R;
import pe.merkur92.empleados.adapters.EmpleadosAdapter;
import pe.merkur92.empleados.repositories.EmpleadoRepositorio;

public class MainActivity extends AppCompatActivity{

    private RecyclerView empleadosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empleadosList = findViewById(R.id.empleados_list);
        empleadosList.setLayoutManager(new LinearLayoutManager(this));

        EmpleadosAdapter adapter = new EmpleadosAdapter();
        adapter.setEmpleados(EmpleadoRepositorio.getEmpleados());

        empleadosList.setAdapter(adapter);

    }

}
