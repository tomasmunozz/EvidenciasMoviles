package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaValidacionTest {

    private EmpresaValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion=new EmpresaValidacion();
        System.out.println("Iniciando prueba");
    }

    @Test
    public void validarNitFuncionaCorrectamente(){
        String nitPrueba = "6667773330";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNitFuncionaIncorrectamente(){
        String nitPrueba = "666777";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Thomas Gomez"; //Preparo la funcion
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombre(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres(){
        String nombrePrueba = "thomy";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombre(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
}