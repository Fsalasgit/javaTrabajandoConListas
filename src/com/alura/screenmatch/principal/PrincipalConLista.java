package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConLista {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(7);
        var peliculaFranco = new Pelicula("El señor de los anillos",2001);
        peliculaFranco.evalua(10);
        Serie lost = new Serie("Lost",2000);
        lost.evalua(5);

        //Tomas la super clase para unir en el array
        //ArrayList<Titulo> lista = new LinkedList<>();

        //Ejemplo de programación orientada a interfas
        // podemos cambiar de una a otra implementacion y usar los mismos metodos
        List<Titulo> lista = new LinkedList<>();

        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaFranco);
        lista.add(lost);

        for(Titulo item:lista){

            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificacion()>2){
                // Casteamos para que no me derror
                // con pelicula eliminamos esta linea
                // Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtista = new ArrayList<>();
        listaDeArtista.add("Penelope Cruz");
        listaDeArtista.add("Antonio Banderas");
        listaDeArtista.add("Guillermo Franchella");

        System.out.println("Lista de artista no odedenada: " + listaDeArtista);
        Collections.sort(listaDeArtista);
        System.out.println("Lista de artista odedenada: " + listaDeArtista);

        Collections.sort(lista);
        System.out.println("Lista de titulos odedenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de titulos odedenada por fecha: " + lista);
    }
}
