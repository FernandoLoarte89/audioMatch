package com.audioMatch.modelos;

public class Cancion extends Audio {

    private String album;
    private String cantante;
    private String genero;
    private int duracion;

    @Override
    public int getClasificacion() {
        if (getTotalDeMeGusta() > 500) {
            return 5;
        } else {
            return 2;
        }
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCantante() {
        return cantante;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}
