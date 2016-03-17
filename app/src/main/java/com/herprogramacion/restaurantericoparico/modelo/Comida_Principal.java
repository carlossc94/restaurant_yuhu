package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by CarlosIsrael on 16/03/2016.
 */
public class Comida_Principal {


    private static Comida[] comida = { new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo,"Pasta Alfredo"),new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa,"Pasta a la Boloñesa")
    ,new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones,"Pasta Camarones Con Curry"),new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle,"Pasta con Chipotle"),
            new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos,"Pasta Cuatro Quesos")};

    public static List<Comida> getCourses() {
        return Arrays.asList(comida);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static Comida getCourseByPosition(int position) {
        return comida[position];
    }



}
