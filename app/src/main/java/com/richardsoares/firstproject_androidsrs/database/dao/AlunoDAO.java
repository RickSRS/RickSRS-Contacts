package com.richardsoares.firstproject_androidsrs.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.richardsoares.firstproject_androidsrs.model.Aluno;

import java.util.List;

@Dao
public interface AlunoDAO {
    @Insert
    void salva(Aluno aluno);

    @Query("SELECT * FROM aluno")
    List<Aluno> todos();

    @Delete
    void remove(Aluno aluno);

    @Update
    void edita(Aluno aluno);
}
