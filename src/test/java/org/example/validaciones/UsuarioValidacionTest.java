package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //Crear objeto de la clase que quiero probar
    private UsuarioValidacion validacion;

    //Preparar las pruebas que vamos a realizar
    @BeforeEach
    public void configurarPruebas(){
        this.validacion=new UsuarioValidacion();
        System.out.println("Iniciando prueba");
    }
    //Programamos nuestras pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente(){
        String nombrePrueba="Thomas Gomez"; //Preparo la funcion
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres(){
        String nombrePrueba = "thomy";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void ValidarNombresFuncionaIncorrectoPorCaracteresInvalidos(){
        String nombrePrueba = "23988765544";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCorreoFuncionaCorrectamente(){
        String correoPrueba = "tomiroyale@gmail.com";
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFuncionaIncorrectoPorFormato(){
        String correpPrueba = "torito.es";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarCorreo(correpPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public  void validarUbicacionFuncionaCorrectamente(){
        Integer ubicacionPrueba = 3;
        boolean respuesta = Assertions.assertDoesNotThrow(()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionFuncionaIncorrectamente(){
        Integer ubicacionPrueba = 5;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(),respuesta.getMessage());
    }
}