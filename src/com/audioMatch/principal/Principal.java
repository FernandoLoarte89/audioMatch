package com.audioMatch.principal;

import com.audioMatch.modelos.Cancion;
import com.audioMatch.modelos.MisFavoritos;
import com.audioMatch.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("El cantante");
        miCancion.setCantante("Hector Lavoe");
        miCancion.setGenero("Salsa");

        for (int i = 0; i < 5000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 500; i++) {
            miCancion.reproduce();
        }

        System.out.println("La canción *** " + miCancion.getTitulo() +
                " *** del cantante y compositor *** " + miCancion.getCantante() + " *** tiene: " );
        System.out.println("Total de reproducciones:  " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de 'me gusta':  " + miCancion.getTotalDeMeGusta());
        System.out.println("********************************************");
        System.out.println("     ");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Marco Sifuentes");
        miPodcast.setDescripcion("Telefónica pagará a Sunat");
        miPodcast.setTitulo("LaEncerrona");

        for (int i = 0; i < 1000; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 3000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("El PodCast *** " + miPodcast.getTitulo() +
                " *** del comunicador *** " + miPodcast.getPresentador() + " *** tiene: " );
        System.out.println("Total de reproducciones:  " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de 'me gusta':  " + miPodcast.getTotalDeMeGusta());
        System.out.println("   ");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miCancion);
        favoritos.adiciona(miPodcast);


    }
}
