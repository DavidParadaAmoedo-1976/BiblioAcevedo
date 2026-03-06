package org.DavidParada.modelo.entidad;

import org.DavidParada.modelo.enums.EdicionEnum;

public class LibroEntidad {
    private Long idLibro;
    private String[] Autor;
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

    public LibroEntidad() {
    }

    public LibroEntidad(Long idLibro,
                        String[] autor,
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
        Autor = autor;
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
}

