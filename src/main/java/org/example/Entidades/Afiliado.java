package org.example.Entidades;

import org.example.Entidades.Interfaces.Ilegal;
import org.example.Entidades.Interfaces.Ireporte;
import org.example.validaciones.AfiliadoValidacion;

public class Afiliado extends Usuario implements Ireporte{

    private Integer valorMensualidad;
    private AfiliadoValidacion validacion=new AfiliadoValidacion();
    public Afiliado() {
    }

    @Override
    public Boolean registrar() {
        return null;
    }

    public Afiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMensualidad) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMensualidad = valorMensualidad;
    }

    public Integer getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(Integer valorMensualidad) {
        try {
            this.validacion.validarMensualidad(valorMensualidad);
            this.valorMensualidad=valorMensualidad;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }

}
