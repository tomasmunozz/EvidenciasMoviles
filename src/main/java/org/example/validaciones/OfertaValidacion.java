package org.example.validaciones;


import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OfertaValidacion {

    protected Util util = new Util();

    public boolean validarTitulo(String titulo) throws Exception{

        if(titulo.length() > 20){
            throw new Exception(Mensaje.NUMERO_CARACTERES_OFERTA.getMensaje());
        } else {
            return true;
        }
    }

    public boolean validarCostoPersona(Double costo) throws Exception{

        if(costo < 1){
            throw new Exception(Mensaje.COSTO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }



    public boolean validarFormatoFecha (String fechaInicio) throws Exception {
        if (!util.validarExpresionRegular(fechaInicio, "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$")) {
            throw new Exception(Mensaje.FECHA_INICIO_INVALIDA.getMensaje());
        }  else {
            return true;
        }
    }


    public boolean validarFechaFin (LocalDate fechaInicio, LocalDate fechaFin) throws Exception {

         if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensaje.FECHA_FIN_INVALIDA.getMensaje());
        }else{
            return true;
        }
    }


}



