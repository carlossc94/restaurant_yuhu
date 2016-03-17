package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private int precio;
    private String nombre;
    private int idDrawable;
    private String descripcion;

    public Comida(int precio, String nombre, int idDrawable,String descripcion) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        this.descripcion=descripcion;
    }


    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> DESAYUNOS = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();
    public static final List<Comida> COMIDA_LIST = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo,"Pasta Alfredo"));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa,"Pasta Boloñesa"));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones,"Pasta Camarones Con Curry"));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle, "Pasta De Chipotle"));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos, "Pasta Cuatro Quesos"));

        COMIDA_LIST.add(new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo, "Pasta Alfredo"));
        COMIDA_LIST.add(new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa,"Pasta Boloñesa"));
        COMIDA_LIST.add(new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones,"Pasta Camarones Con Curry"));
        COMIDA_LIST.add(new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle, "Pasta De Chipotle"));
        COMIDA_LIST.add(new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos, "Pasta Cuatro Quesos"));

        PLATILLOS.add(new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo, "Pasta Alfredo"));
        PLATILLOS.add(new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa,"Pasta Boloñesa"));
        PLATILLOS.add(new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones,"Pasta Camarones Con Curry"));
        PLATILLOS.add(new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle, "Pasta De Chipotle"));
        PLATILLOS.add(new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos, "Pasta Cuatro Quesos"));

        BEBIDAS.add(new Comida(20, "Te De Limon", R.drawable.te,""));

        DESAYUNOS.add(new Comida(25, "Hot Cakes 'Heraclitos'", R.drawable.hotcakes,""));
        DESAYUNOS.add(new Comida(35, "Sincronizadas 'Kukulcan'", R.drawable.sincronizadas,""));
        DESAYUNOS.add(new Comida(40, "Sandwich Club con Papas Yisus", R.drawable.sandwichclub,""));
        DESAYUNOS.add(new Comida(35, "Sandwich Parvati", R.drawable.sandwich,""));
        DESAYUNOS.add(new Comida(40, "Chilaquiles Rojos 'Osho'", R.drawable.osho,""));
        DESAYUNOS.add(new Comida(40, "Hamburguesas con Papas 'Shiva'", R.drawable.hamburguesa,""));
        DESAYUNOS.add(new Comida(35, "Huevos San Pedro", R.drawable.sanpedro,""));
        DESAYUNOS.add(new Comida(35, "Huevos 'Quetzalcoatl'", R.drawable.quetzal,""));
        DESAYUNOS.add(new Comida(40, "Hot Cakes 'Napoleón'", R.drawable.napoleon,""));
    }


    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public static Comida getCourseByPosition(int position) {
        return COMIDA_LIST.get(position) ;
    }
}
