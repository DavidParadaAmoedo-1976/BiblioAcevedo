package org.DavidParada.modelo.dto;

import org.DavidParada.modelo.entidad.Coleccion;
import org.DavidParada.modelo.entidad.objetos.Descripcion;
import org.DavidParada.modelo.entidad.objetos.Signatura;
import org.DavidParada.modelo.enums.EdicionEnum;

public record LibroDto(Long idLibro,
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
}
