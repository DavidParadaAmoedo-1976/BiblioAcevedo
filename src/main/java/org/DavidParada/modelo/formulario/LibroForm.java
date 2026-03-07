package org.DavidParada.modelo.formulario;

import org.DavidParada.modelo.entidad.Coleccion;
import org.DavidParada.modelo.entidad.objetos.Descripcion;
import org.DavidParada.modelo.entidad.objetos.Signatura;
import org.DavidParada.modelo.enums.EdicionEnum;

import java.util.List;

public class LibroForm {
    private List<String> autor;
    private String titulo;
    private EdicionEnum edicion;
    private String lugarPublicacion;
    private String editorial;
    private Integer anoPublicacion;
    private Descripcion descripcion;
    private Coleccion coleccion;
    private String isbn;
    private String depositoLegal;
    private String materias;
    private String clasificacion;
    private Signatura signatura;

    public LibroForm(String[] autor,
                     String titulo,
                     EdicionEnum edicion,
                     String lugarPublicacion,
                     String editorial,
                     Integer anoPublicacion,
                     Descripcion descripcion,
                     Coleccion coleccion,
                     String isbn,
                     String depositoLegal,
                     String materias,
                     String clasificacion,
                     Signatura signatura) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicion = edicion;
        this.lugarPublicacion = lugarPublicacion;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.descripcion = descripcion;
        this.coleccion = coleccion;
        this.isbn = isbn;
        this.depositoLegal = depositoLegal;
        this.materias = materias;
        this.clasificacion = clasificacion;
        this.signatura = signatura;
    }

    public List<String> getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public EdicionEnum getEdicion() {
        return edicion;
    }

    public String getLugarPublicacion() {
        return lugarPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public Integer getAnoPublicacion() {
        return anoPublicacion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDepositoLegal() {
        return depositoLegal;
    }

    public String getMaterias() {
        return materias;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public Signatura getSignatura() {
        return signatura;
    }
}
