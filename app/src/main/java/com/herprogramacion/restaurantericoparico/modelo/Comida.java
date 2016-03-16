package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private int precio;
    private String nombre;
    private int idDrawable;

    public Comida(int precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> DESAYUNOS = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle));
        COMIDAS_POPULARES.add(new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos));

        PLATILLOS.add(new Comida(55, "Pasta Alfredo", R.drawable.pastaalfredo));
        PLATILLOS.add(new Comida(55, "Pasta Boloñesa", R.drawable.pastabolonesa));
        PLATILLOS.add(new Comida(55, "Pasta Camarones Con Curry", R.drawable.pastacamarones));
        PLATILLOS.add(new Comida(55, "Pasta De Chipotle", R.drawable.pastachipotle));;
        PLATILLOS.add(new Comida(55, "Pasta Cuatro Quesos", R.drawable.pastacuatroquesos));

        BEBIDAS.add(new Comida(20, "Te De Limon", R.drawable.te));

        DESAYUNOS.add(new Comida(25, "Hot Cakes 'Heraclitos'", R.drawable.hotcakes));
        DESAYUNOS.add(new Comida(35, "Sincronizadas 'Kukulcan'", R.drawable.sincronizadas));
        DESAYUNOS.add(new Comida(40, "Sandwich Club con Papas Yisus", R.drawable.sandwichclub));
        DESAYUNOS.add(new Comida(35, "Sandwich Parvati", R.drawable.sandwich));
        DESAYUNOS.add(new Comida(40, "Chilaquiles Rojos 'Osho'", R.drawable.osho));
        DESAYUNOS.add(new Comida(40, "Hamburguesas con Papas 'Shiva'", R.drawable.hamburguesa));
        DESAYUNOS.add(new Comida(35, "Huevos San Pedro", R.drawable.sanpedro));
        DESAYUNOS.add(new Comida(35, "Huevos 'Quetzalcoatl'", R.drawable.quetzal));
        DESAYUNOS.add(new Comida(40, "Hot Cakes 'Napoleón'", R.drawable.napoleon));
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
}
