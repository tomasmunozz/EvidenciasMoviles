package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;

public class EmpresaValidacion {


    protected Util util = new Util();

    public Boolean validarNit (String nit) throws Exception {
        if (nit.length() != 10) {
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());

        } else if (!util.validarExpresionRegular(nit,  "^[0-9]+$")) {
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());

        }else{
            return true;
        }
    }

    public Boolean validarNombre(String nombre)throws Exception {
        if(nombre.length()<30){
            throw new Exception(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

}
