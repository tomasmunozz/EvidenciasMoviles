package org.example.Entidades;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;



public class Reserva {

    public Util util = new Util();

    private Integer id;
    private Usuario usuario;
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate fecha;
    private Integer numeropersonasReserva;
    protected ReservaValidacion validacion = new ReservaValidacion();



    public Reserva() {
    }


    public Reserva(Integer id, Usuario usuario, Oferta oferta, Double costoTotal, LocalDate fecha, Integer numeropersonasReserva) {
        this.id = id;
        this.usuario = usuario;
        this.oferta = oferta;
        this.costoTotal = costoTotal;
        this.fecha = fecha;
        this.numeropersonasReserva = numeropersonasReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {

        this.oferta = oferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFecha() {

        return fecha;
    }

    public void setFecha(String fecha) {

        try {
            ReservaValidacion reservaValidacion = new ReservaValidacion();
            reservaValidacion.validarFormatoFecha(fecha);
            this.fecha = LocalDate.parse(fecha , util.formatoFecha);
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }


    public Integer getNumeropersonasReserva() {

        return numeropersonasReserva;
    }

    public void setNumeropersonasReserva(String  numeropersonasReservaString) {
        try {
            Integer numeropersonasReserva = Integer.parseInt(numeropersonasReservaString);
            this.validacion.validarNumeroPersonasReserva(numeropersonasReserva);
            this.numeropersonasReserva = numeropersonasReserva;
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }
}

