package org.DavidParada.modelo.entidad;

import org.DavidParada.modelo.enums.PaisEnum;
import org.DavidParada.modelo.enums.TipoDeCuentaEnum;

import java.time.Instant;
import java.time.LocalDate;

public class UsuarioEntidad {
    private final Long idUsuario;
    private final String nombreUsuario;
    private final String nombreReal;
    private final String email;
    private final String password;
    private final PaisEnum pais;
    private final LocalDate fechaNacimiento;
    private final Instant fechaRegistro;
    private final String avatar;
    private final TipoDeCuentaEnum tipoDeCuentaEnum;

    public UsuarioEntidad(Long idUsuario,
                          String nombreUsuario,
                          String nombreReal,
                          String email,
                          String password,
                          PaisEnum pais,
                          LocalDate fechaNacimiento,
                          Instant fechaRegistro,
                          String avatar,
                          TipoDeCuentaEnum tipoDeCuentaEnum) {

        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.nombreReal = nombreReal;
        this.email = email;
        this.password = password;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;
        this.avatar = avatar;
        this.tipoDeCuentaEnum = tipoDeCuentaEnum;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public PaisEnum getPais() {
        return pais;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public String getAvatar() {
        return avatar;
    }

    public TipoDeCuentaEnum getTipoDeCuentaEnum() {
        return tipoDeCuentaEnum;
    }
}