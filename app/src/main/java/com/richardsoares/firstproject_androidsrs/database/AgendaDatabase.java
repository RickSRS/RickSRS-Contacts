package com.richardsoares.firstproject_androidsrs.database;

import static com.richardsoares.firstproject_androidsrs.database.AgendaMigrations.TODAS_MIGRATIONS;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.richardsoares.firstproject_androidsrs.database.converter.ConversorCalendar;
import com.richardsoares.firstproject_androidsrs.database.converter.ConversorTipoTelefone;
import com.richardsoares.firstproject_androidsrs.database.dao.AlunoDAO;
import com.richardsoares.firstproject_androidsrs.database.dao.TelefoneDAO;
import com.richardsoares.firstproject_androidsrs.model.Aluno;
import com.richardsoares.firstproject_androidsrs.model.Telefone;

@Database(entities = {Aluno.class, Telefone.class}, version = 5, exportSchema = false)
@TypeConverters({ConversorCalendar.class, ConversorTipoTelefone.class})
public abstract class AgendaDatabase extends RoomDatabase {

    private static final String BANCO_DE_DADOS = "agenda.db";

    public abstract AlunoDAO getRoomAlunoDAO();

    public static AgendaDatabase getInstance(Context context) {
        return Room.databaseBuilder(context, AgendaDatabase.class, BANCO_DE_DADOS)
                .allowMainThreadQueries()
                .addMigrations(TODAS_MIGRATIONS)
                .build();
    }

    public abstract TelefoneDAO getTelefoneDAO();
}
