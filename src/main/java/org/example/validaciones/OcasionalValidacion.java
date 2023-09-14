package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class OcasionalValidacion {

    protected Util util = new Util();


    public boolean validarCostoEvento(Integer valor)throws Exception {

        if (valor > 200000 || valor<0) {
            throw new Exception(Mensaje.COSTO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}
