package com.richardsoares.firstproject_androidsrs.database.converter;

import androidx.room.TypeConverter;

import java.util.Calendar;

public class ConversorCalendar {
    @TypeConverter
    public Long paraLong(Calendar valor) {
        if(valor != null){
            return valor.getTimeInMillis();
        }
        return null;
    }

    @TypeConverter
    public Calendar paraCalendar(Long valor) {
        Calendar dataAtual = Calendar.getInstance();
        if (valor != null) {
            dataAtual.setTimeInMillis(valor);
        }
        return dataAtual;
    }
}
