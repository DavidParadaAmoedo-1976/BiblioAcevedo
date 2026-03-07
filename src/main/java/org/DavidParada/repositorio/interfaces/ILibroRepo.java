package org.DavidParada.repositorio.interfaces;

import org.DavidParada.modelo.entidad.LibroEntidad;

import java.util.List;

public interface ILibroRepo extends ICrud{
    boolean existeTitulo(String titulo);

    List<LibroEntidad> buscarConFiltros(
            String autor,
            String titulo,
            String editorial,
            String materias,
            String isbn
    );
}
