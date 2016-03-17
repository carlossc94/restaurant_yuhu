package com.herprogramacion.restaurantericoparico.modelo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.herprogramacion.restaurantericoparico.R;

/**
 * Created by CarlosIsrael on 17/03/2016.
 */
public class Fragment_ubicacion extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ubicacion,container,false);
        return view;
    }
}
