package com.example.appmascotas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appmascotas.adapter.MascotaAdaptador;
import com.example.appmascotas.fragment.RecyclerViewFragment;
import com.example.appmascotas.pojo.Mascota;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity implements Favoritos, Favoritos2 {


    ArrayList<Mascota> mascotasFavoritas;
    private RecyclerView rvMascotasFavoritas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_fav, container, false);

        mascotasFavoritas = new ArrayList<Mascota>();
        mascotasFavoritas.add(new Mascota("Rinoceronte",21,R.drawable.rino));
        mascotasFavoritas.add(new Mascota("Leon",198,R.drawable.leon));
        mascotasFavoritas.add(new Mascota("Tigre",177,R.drawable.tigre));
        mascotasFavoritas.add(new Mascota("Komodo",104,R.drawable.komodo));
        mascotasFavoritas.add(new Mascota("Cocodrilo",69,R.drawable.cocodrilo));

        rvMascotasFavoritas = (RecyclerView) v.findViewById(R.id.rvMacotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);

        /* GridLayoutManager glm = new GridLayoutManager(getActivity(), 2);*/


        rvMascotasFavoritas.setLayoutManager(llm);
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotasFavoritas);
        rvMascotasFavoritas.setAdapter(mascotaAdaptador);

        return v;

    }

}