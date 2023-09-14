package org.example.Entidades;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;

public class Oferta {


    private Util util = new Util();
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Empresa local;

    protected OfertaValidacion validacion = new OfertaValidacion();



    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Empresa local) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {


        try {
            validacion.validarTitulo(titulo);
            this.titulo = titulo;
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {

        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            OfertaValidacion ofertaValidacion= new OfertaValidacion();
            ofertaValidacion.validarFormatoFecha(fechaInicio);
            this.fechaInicio = LocalDate.parse(fechaInicio, util.formatoFecha);
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public LocalDate getFechaFin() {

        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {

            validacion.validarFormatoFecha(fechaFin);
            validacion.validarFechaFin(getFechaInicio(),LocalDate.parse(fechaFin, util.formatoFecha));
            this.fechaFin = LocalDate.parse(fechaFin, util.formatoFecha);
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }

    }

    public Double getCostoPersona() {
        return costoPersona;
    }


    public void setCostoPersona(String costoPersonaString) {
        try {
            Double costoPersona = Double.parseDouble(costoPersonaString);
            this.validacion.validarCostoPersona(costoPersona);
            this.costoPersona = costoPersona;
        } catch (NumberFormatException e) {
            System.out.println("\u001B[31m"+"Error: Ingrese un valor numérico válido para el costo de la persona."+"\u001B[0m");
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }


    public Empresa getLocal() {
        return local;
    }

    public void setLocal(Empresa local) {
        this.local = local;
    }
}
