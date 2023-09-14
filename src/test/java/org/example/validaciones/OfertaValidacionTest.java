package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.ofertaValidacion=new OfertaValidacion();
    }
    @Test
    public void validarTituloFuncionaCorrectamente(){
        String prueba= "LA perra en calor";
        boolean respuesta= assertDoesNotThrow(()->this.ofertaValidacion.validarTitulo(prueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarTituloFuncionaIncorrectamente(){
        String prueba= "ejedcnjcnejcnjecneeeeeeejddjdjjdjdjdcnjcn";
        Exception respuesta= Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarTitulo(prueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_OFERTA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCostoPersonaFuncionaCorrectamente(){
        Double prueba= 2.000;
        boolean respuesta= assertDoesNotThrow(()->this.ofertaValidacion.validarCostoPersona(prueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCostoPersonaFuncionaIncorrectamente(){
        Double prueba = 0.0;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarCostoPersona(prueba));
        Assertions.assertEquals(Mensaje.COSTO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarFormatoFechaFuncionaCorrectamente(){
        String pruebaFecha= "17/9/2023";
        boolean respuesta= assertDoesNotThrow(()->this.ofertaValidacion.validarFormatoFecha(pruebaFecha));
        Assertions.assertTrue(respuesta);}

    @Test
    public void validarFormatoFechaFuncionaIncorrectamente(){
        String pruebaFecha= "97/29/2028";
        Exception respuesta=Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarFormatoFecha(pruebaFecha));
        Assertions.assertEquals(Mensaje.FECHA_INICIO_INVALIDA.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarFechaFinFuncionaCorrectamente(){
        LocalDate pruebaFecha= LocalDate.of(2023,06,17);
        LocalDate pruebafechafin= LocalDate.of(2023, 07,12);
        boolean respuesta= assertDoesNotThrow(()->this.ofertaValidacion.validarFechaFin(pruebaFecha, pruebafechafin));
        Assertions.assertTrue(respuesta);}

    @Test
    public void validarFechaFinFuncionaIncorrectamente(){
        LocalDate pruebaFecha= LocalDate.of(2024,06,17);
        LocalDate pruebafechafin= LocalDate.of(2023, 07,12);
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.ofertaValidacion.validarFechaFin(pruebaFecha,pruebafechafin));
        Assertions.assertEquals(Mensaje.FECHA_FIN_INVALIDA.getMensaje(),respuesta.getMessage());
    }



}