
package com.example.roomapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Pelicula.class, version = 1)
abstract public class PeliculaDB extends RoomDatabase {

    public abstract PeliculaDAO peliculaDAO();
}