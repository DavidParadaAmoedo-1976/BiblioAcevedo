package org.DavidParada.modelo.enums;

public enum TipoDeCuentaEnum {


    ROOT("Root"),
    ADMINISTRADOR("Administrador"),
    USUARIO("Usuario"),
    INVITADO("Invitado");

    private final String TEXTO;

    TipoDeCuentaEnum(String TEXTO) {
        this.TEXTO = TEXTO;
    }

    public String getTexto() {
        return TEXTO;
    }
}
