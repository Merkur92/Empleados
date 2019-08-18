package pe.merkur92.empleados.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.merkur92.empleados.R;
import pe.merkur92.empleados.activities.DetailActivity;
import pe.merkur92.empleados.models.Empleado;

public class EmpleadosAdapter extends RecyclerView.Adapter<EmpleadosAdapter.ViewHolder> {
    private List<Empleado> empleados;

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }


    public EmpleadosAdapter() {
        empleados = new ArrayList<>();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.empleado_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Empleado empleado = empleados.get(i);
        viewHolder.fullnameText.setText(empleado.getFullname());
        viewHolder.cargoText.setText(empleado.getCargo());
        Context c = viewHolder.itemView.getContext();
        int idRsr = c.getResources().getIdentifier(empleado.getCargo(), "drawable", c.getPackageName());
        viewHolder.pictureImage.setImageResource(idRsr);
    }

    @Override
    public int getItemCount() {
        return empleados.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView pictureImage;
        TextView fullnameText;
        TextView cargoText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            cargoText = itemView.findViewById(R.id.cargo_text);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Context c = itemView.getContext();
            int position = getAdapterPosition();
            Empleado empleado = empleados.get(position);
            Intent i = new Intent(c, DetailActivity.class);

            i.putExtra("fullname", empleado.getFullname());
            i.putExtra("cargo", empleado.getCargo());
            i.putExtra("email", empleado.getEmail());
            i.putExtra("telefono", empleado.getTelefono().toString());

            c.startActivity(i);
        }
    }


}
