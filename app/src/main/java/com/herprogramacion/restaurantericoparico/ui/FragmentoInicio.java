package com.herprogramacion.restaurantericoparico.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.herprogramacion.restaurantericoparico.R;
import com.herprogramacion.restaurantericoparico.modelo.Comida;
import com.herprogramacion.restaurantericoparico.modelo.Comida_Principal;

import java.util.List;

/**
 * Fragmento para la sección de "Inicio"
 */
public class FragmentoInicio extends Fragment {
    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private SimpleAdapter adaptador;
    List<Comida> items;

    public FragmentoInicio() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_inicio, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        adaptador = new SimpleAdapter(view.getContext(), Comida_Principal.getCourses());
        reciclador.setAdapter(adaptador);
        return view;
    }

}
