package com.audioMatch.modelos;

public class MisFavoritos {

    public void adiciona(Audio audio) {
        if (audio.getClasificacion() >= 4) {
            System.out.println(audio.getTitulo() + " Uno de los mas recomendados !!");
        } else {
            System.out.println(audio.getTitulo() + " También es muy recomendado !!");
        }
    }
}
