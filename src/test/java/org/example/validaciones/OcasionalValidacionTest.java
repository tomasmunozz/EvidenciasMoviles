package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcasionalValidacionTest {

    OcasionalValidacion ocasionalValidacion;
    @BeforeEach
    public void setUp (){
        this.ocasionalValidacion=new OcasionalValidacion();
    }

    @Test
    public void validarCostoEventoFuncionaCorrectamente(){
        Integer valorPrueba=500;
        boolean respuesta= Assertions.assertDoesNotThrow(()->this.ocasionalValidacion.validarCostoEvento(valorPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarCostoEventoFuncionaIncorrectamente(){
        Integer valorPrueba=-100;
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.ocasionalValidacion.validarCostoEvento(valorPrueba));
        Assertions.assertEquals(Mensaje.COSTO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

}