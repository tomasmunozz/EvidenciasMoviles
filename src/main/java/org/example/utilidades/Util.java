package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public DateTimeFormatter formatoFecha =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String mostrarFechas(LocalDate fecha) {

        return  fecha.format(formatoFecha);
    }




    public boolean validarExpresionRegular(String cadena, String expresionRegular){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(cadena);
        if(coincidencia.matches()) {
            return  true;
        }else {
            return false;
        }
    }

  /* public static String mayusculas(String a) {
        String[] palabras = a.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
        }

        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }*/
}

