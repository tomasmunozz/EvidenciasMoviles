package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private ReservaValidacion reservaValidacion;
    @BeforeEach
    public void configurarPruebas(){
        this.reservaValidacion=new ReservaValidacion();
    }
    @Test
    public void validarFormatoFechaFuncionaCorrectamente(){
        String pruebaFecha= "17/9/2023";
        boolean respuesta= assertDoesNotThrow(()->this.reservaValidacion.validarFormatoFecha(pruebaFecha));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarFormatoFechaFuncionaIncorrectamente(){
        String pruebaFecha= "97/29/2028";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarFormatoFecha(pruebaFecha));
        Assertions.assertEquals(Mensaje.FECHA_INVALIDA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNumeroPersonasReservaFuncionaCorrectamente(){
        Integer pruebaPersonas= 3;
        boolean respuesta= assertDoesNotThrow(()->this.reservaValidacion.validarNumeroPersonasReserva(pruebaPersonas));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasReservaFuncionaIncorrectamente(){
        Integer prueba=5;
        Exception respuesta= assertThrows(Exception.class,()->this.reservaValidacion.validarNumeroPersonasReserva(prueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS_RESERVA.getMensaje(),respuesta.getMessage());
    }

}