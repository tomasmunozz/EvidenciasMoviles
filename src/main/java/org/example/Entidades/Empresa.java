package org.example.Entidades;
import org.example.Entidades.Interfaces.Ireporte;
import org.example.validaciones.EmpresaValidacion;


public class Empresa implements Ireporte {

    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;
    protected EmpresaValidacion validacion = new EmpresaValidacion();

    public Empresa() {
    }

    public Empresa(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {

        try {
            validacion.validarNit(nit);
            this.nit = nit;
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            validacion.validarNombre(nombre);
            this.nombre = nombre;
        } catch (Exception error) {
            System.out.println("\u001B[31m"+ error.getMessage() +"\u001B[0m");
        }
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
