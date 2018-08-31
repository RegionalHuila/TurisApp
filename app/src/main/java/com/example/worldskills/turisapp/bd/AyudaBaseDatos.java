package com.example.worldskills.turisapp.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AyudaBaseDatos extends SQLiteOpenHelper {

    //Se crea la tabla Hoteles
    private static final String CREAR_SQL_HOTELES =

            //Se crean los campos que iran dentro de la tabla hoteles
            "CREATE TABLE " + TablaDatos.LectorEntradaHoteles.NOMBRE_TABLA + " (" +
                    TablaDatos.LectorEntradaHoteles._ID + " INTEGER PRIMARY KEY," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_NOMBRE + " TEXT," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_DESCRIPCION_CORTA + " TEXT," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_DESCRIPCION+ " TEXT," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_UBICACION + " TEXT," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_LATITUD + " TEXT," +
                    TablaDatos.LectorEntradaHoteles.COLUMNA_LONGITUD + " TEXT)";
    private static final String CREAR_SQL_SITIOS =
            "CREATE TABLE " + TablaDatos.LectorEntradaSitios.NOMBRE_TABLA + " (" +
                    TablaDatos.LectorEntradaSitios._ID + " INTEGER PRIMARY KEY," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_NOMBRE + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_DESCRIPCION_CORTA + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_DESCRIPCION+ " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_UBICACION + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_LATITUD + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_LONGITUD + " TEXT)";
    private static final String CREAR_SQL_RESTAURANTES =
            "CREATE TABLE " + TablaDatos.LectorEntradaSitios.NOMBRE_TABLA + " (" +
                  //  TablaDatos.LectorEntrada._ID + " INTEGER PRIMARY KEY," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_NOMBRE + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_DESCRIPCION_CORTA + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_DESCRIPCION+ " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_UBICACION + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_LATITUD + " TEXT," +
                    TablaDatos.LectorEntradaSitios.COLUMNA_LONGITUD + " TEXT)";


    private static final String SQL_DELETE_ENTRIES =
            //Metodo para borrar la tabla
            "DROP TABLE IF EXISTS " + TablaDatos.LectorEntradaHoteles.NOMBRE_TABLA;
    public AyudaBaseDatos(Context context) {
        super(context, "turist.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
