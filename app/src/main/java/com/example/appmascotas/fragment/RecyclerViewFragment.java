package com.example.appmascotas.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appmascotas.FavoritosActivity;
import com.example.appmascotas.MainActivity;
import com.example.appmascotas.R;
import com.example.appmascotas.adapter.MascotaAdaptador;
import com.example.appmascotas.menu.ActivityAcercaDe;
import com.example.appmascotas.menu.ActivityContacto;
import com.example.appmascotas.pojo.Mascota;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Leon",198,R.drawable.leon));
        mascotas.add(new Mascota("Cocodrilo",69,R.drawable.cocodrilo));
        mascotas.add(new Mascota("Komodo",104,R.drawable.komodo));
        mascotas.add(new Mascota("Rinoceronte",21,R.drawable.rino));
        mascotas.add(new Mascota("Tigre",177,R.drawable.tigre));

        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMacotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(RecyclerView.VERTICAL);
        rvMascotas.setLayoutManager(llm);

        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        rvMascotas.setAdapter(mascotaAdaptador);

        return v;
    }



}
