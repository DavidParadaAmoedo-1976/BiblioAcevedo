package org.DavidParada.modelo.dto;

import org.DavidParada.modelo.enums.PaisEnum;
import org.DavidParada.modelo.enums.TipoDeCuentaEnum;

import java.time.Instant;
import java.time.LocalDate;

public record UsuarioDto (Long idUsuario,
                              String nombreUsuario,
                              String nombreReal,
                              String email,
                              String password,
                              PaisEnum pais,
                              LocalDate fechaNacimiento,
                              Instant fechaRegistro,
                              String avatar,
                              TipoDeCuentaEnum tipoDeCuentaEnum) {
}
