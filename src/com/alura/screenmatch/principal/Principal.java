package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("Lost",2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.setDuracionEnMinutos(200);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);


        // Pelicula peliculaFranco = new Pelicula();
        // La palabra var hace inferencia a Pelicula
        var peliculaFranco = new Pelicula("El señor de los anillos",2001);


        peliculaFranco.setDuracionEnMinutos(180);
        peliculaFranco.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();

        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaFranco);

        System.out.println("tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primer pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);
        //sout = [com.alura.screenmatch.modelos.Pelicula@34c45dca, com.alura.screenmatch.modelos.Pelicula@52cc8049, com.alura.screenmatch.modelos.Pelicula@7530d0a]
        //@34c45dca Hace referencia al lugar de la memoria donde está el objeto

        //Métodos de arrayList
        //obj es la unica clase que no es necesario importarla
        System.out.println("La primer pelicula es: " + listaDePeliculas.get(0).toString());

        //utilizamos el constructor no solamente para reservar espacio sino para mandar parametros


    }
}