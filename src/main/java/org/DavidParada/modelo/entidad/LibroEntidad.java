package org.DavidParada.modelo.entidad;

import org.DavidParada.modelo.entidad.objetos.Descripcion;
import org.DavidParada.modelo.entidad.objetos.Signatura;
import org.DavidParada.modelo.enums.EdicionEnum;

import java.util.List;

public class LibroEntidad {
    private final Long idLibro;
    private final List<String> autor;
    private final String titulo;
    private final EdicionEnum edicion;
    private final String lugarPublicacion;
    private final String editorial;
    private final Integer anoPublicacion;
    private final Descripcion descripcion;
    private final Coleccion coleccion;
    private final String isbn;
    private final String depositoLegal;
    private final String materiasEnum;
    private final String clasificacion;
    private final Signatura signatura;
    private final String localizacion;


    public LibroEntidad(Long idLibro,
                        List<String> autor,
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
        this.idLibro = idLibro;
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

    public Long getIdLibro() {
        return idLibro;
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

