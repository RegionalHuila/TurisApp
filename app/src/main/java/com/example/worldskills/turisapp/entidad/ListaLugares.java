package com.example.worldskills.turisapp.entidad;

public class ListaLugares {

    String urlImagen, nombre, ubicacion,descripion,laltitud,longitud;

    //constructor vacio
    public ListaLugares() {
    }

    //constructor lleno con los campos para el gridlayout
    public ListaLugares(String urlImagen, String nombre, String ubicacion, String descripion, String laltitud, String longitud) {
        this.urlImagen = urlImagen;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripion = descripion;
        this.laltitud = laltitud;
        this.longitud = longitud;
    }



    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String getLaltitud() {
        return laltitud;
    }

    public void setLaltitud(String laltitud) {
        this.laltitud = laltitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
