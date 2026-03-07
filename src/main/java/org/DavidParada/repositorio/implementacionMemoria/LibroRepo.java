package org.DavidParada.repositorio.implementacionMemoria;

import org.DavidParada.modelo.entidad.LibroEntidad;
import org.DavidParada.repositorio.interfaces.ILibroRepo;

import java.util.List;

public class LibroRepo implements ILibroRepo {
    @Override
    public boolean existeTitulo(String titulo) {
        return false;
    }

    @Override
    public List<LibroEntidad> buscarConFiltros(String autor, String titulo, String editorial, String materias, String isbn) {
        return List.of();
    }

    @Override
    public Object crear(Object formulario) {
        return null;
    }

    @Override
    public Object buscarPorId(Object id) {
        return null;
    }

    @Override
    public List listarTodos() {
        return List.of();
    }

    @Override
    public Object actualizar(Object id, Object formulario) {
        return null;
    }

    @Override
    public boolean eliminar(Object id) {
        return false;
    }
}
