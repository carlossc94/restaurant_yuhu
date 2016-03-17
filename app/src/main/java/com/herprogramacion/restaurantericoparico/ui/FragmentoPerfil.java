package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.herprogramacion.restaurantericoparico.Login;
import com.herprogramacion.restaurantericoparico.PrefUtils;
import com.herprogramacion.restaurantericoparico.R;
import com.herprogramacion.restaurantericoparico.User;
import com.herprogramacion.restaurantericoparico.modelo.Usuario;

/**
 * Fragmento para la pestaña "PERFIL" De la sección "Mi Cuenta"
 */
public class FragmentoPerfil extends Fragment {
TextView textView,textView2,nombre;


    User user;
    public FragmentoPerfil() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        user=PrefUtils.getCurrentUser(getActivity().getApplication());

        View v= inflater.inflate(R.layout.fragmento_perfil, container, false);
        textView = (TextView) v.findViewById(R.id.texto_password);
        textView2 = (TextView) v.findViewById(R.id.texto_email);
        nombre = (TextView) v.findViewById(R.id.texto_nombre);
        textView2.setText(user.email);
        nombre.setText(user.name);


        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                PrefUtils.clearCurrentUser(getActivity());


                // We can logout from facebook by calling following method
                LoginManager.getInstance().logOut();


                Intent i= new Intent(getActivity().getApplication(),Login.class);
                startActivity(i);
                getActivity().finish();

            }
        });

        return v;

    }

}
