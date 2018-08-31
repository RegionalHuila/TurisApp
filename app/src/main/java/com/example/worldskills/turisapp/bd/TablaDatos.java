package com.example.worldskills.turisapp.bd;

import android.provider.BaseColumns;

public final class TablaDatos {

    private TablaDatos() {
    }


    public static class LectorEntradaSitios implements BaseColumns {
        public static final String NOMBRE_TABLA = "sitios";
        public static final String COLUMNA_NOMBRE = "nombre";
        public static final String COLUMNA_DESCRIPCION_CORTA = "descripcioncorta";
        public static final String COLUMNA_DESCRIPCION = "ubicacion";
        public static final String COLUMNA_UBICACION = "descripcion";
        public static final String COLUMNA_LONGITUD = "longitud";
        public static final String COLUMNA_LATITUD = "latitud";
 }
    public static class LectorEntradaHoteles implements BaseColumns {
        public static final String NOMBRE_TABLA = "hoteles";
        public static final String COLUMNA_NOMBRE = "nombre";
        public static final String COLUMNA_DESCRIPCION_CORTA = "descripcioncorta";
        public static final String COLUMNA_DESCRIPCION = "ubicacion";
        public static final String COLUMNA_UBICACION = "descripcion";
        public static final String COLUMNA_LONGITUD = "longitud";
        public static final String COLUMNA_LATITUD = "latitud";
    }
    public static class LectorEntradaRestaurantes implements BaseColumns {
        public static final String NOMBRE_TABLA = "restaurantes";
        public static final String COLUMNA_NOMBRE = "nombre";
        public static final String COLUMNA_DESCRIPCION_CORTA = "descripcioncorta";
        public static final String COLUMNA_DESCRIPCION = "ubicacion";
        public static final String COLUMNA_UBICACION = "descripcion";
        public static final String COLUMNA_LONGITUD = "longitud";
        public static final String COLUMNA_LATITUD = "latitud";
    }
}