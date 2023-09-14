package org.example.utilidades;

public enum Mensaje {

    NUMERO_CARACTERES_INVALIDO("El número de caracteres es inválido"),
    NOMBRE_INVALIDO("El nombre solo acepta letras y espacios"),
    CORREO_INVALIDO("Revisa el formato del correo electrónico"),
    UBICACION_INVALIDA("La ubicación solo puede ser un número entre 1 y 4"),

    NIT_INVALIDO("El nit ingresado no es valido"),

    TIPO_DE_CARACTERES_INVALIDOS("El tipo de caracteres es invalido"),

    FECHA_INVALIDA("El formato de la fecha es inválido"),

    NUMERO_PERSONAS_RESERVA("El número de personas por reserva no puede ser mayor a cuatro ni menor a uno"),

    NUMERO_CARACTERES_OFERTA("El número de caracteres es inválido, pues no debe ser mayor a 20"),


    COSTO_INVALIDO("El costo por persona no puede ser cero o tener un valor negativo"),

    FECHA_INICIO_INVALIDA("la fecha de inicio es inválida"),

    FECHA_FIN_INVALIDA("la fecha final es inválida");

    //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

    private  String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
