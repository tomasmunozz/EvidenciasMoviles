package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class ReservaValidacion {

    private Util util = new Util();

    public Boolean validarFormatoFecha(String fecha)throws  Exception{
        if(!util.validarExpresionRegular(fecha,  "^(0?[1-9]|[1-2][0-9]|3[0-1])/(0?[1-9]|1[0-2])/\\d{4}$")){
            throw new Exception(Mensaje.FECHA_INVALIDA.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarNumeroPersonasReserva (Integer numPersonas) throws Exception{
        if (numPersonas > 4 || numPersonas < 1) {
            throw new Exception(Mensaje.NUMERO_PERSONAS_RESERVA.getMensaje());
        }else{
            return true;
        }
    }
}
