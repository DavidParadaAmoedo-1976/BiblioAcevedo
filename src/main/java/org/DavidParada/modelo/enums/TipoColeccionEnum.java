package org.DavidParada.modelo.enums;

public enum TipoColeccionEnum {


    ENCICLOPEDIA("Enciclopedia"),
    NARRATIVA("N");

    private final String TEXTO;

    TipoColeccionEnum(String TEXTO) {
        this.TEXTO = TEXTO;
    }

    public String getTexto() {
        return TEXTO;
    }
}
