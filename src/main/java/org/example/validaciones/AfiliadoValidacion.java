package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class AfiliadoValidacion {
    protected Util util = new Util();

    public boolean validarMensualidad (Integer valorMensual) throws Exception{
        if(valorMensual<0){
            throw new Exception(Mensaje.COSTO_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
