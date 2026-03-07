package org.DavidParada.modelo.entidad;

import org.DavidParada.modelo.enums.PaisEnum;
import org.DavidParada.modelo.enums.TipoDeCuentaEnum;

import java.time.Instant;
import java.time.LocalDate;

public class UsuarioEntidad {
    private Long idUsuario;
    private String nombreUsuario;
    private String email;
    private String password;
    private PaisEnum pais;
    private LocalDate fechaNacimiento;
    private Instant fechaRegistro;
    private String avatar;
    private TipoDeCuentaEnum estadoCuenta;

    public UsuarioEntidad(Long idUsuario,
                          String nombreUsuario,
                          String email,
                          String password,
                          PaisEnum pais,
                          LocalDate fechaNacimiento,
                          Instant fechaRegistro,
                          String avatar,
                          TipoDeCuentaEnum estadoCuenta) {

        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;
        this.avatar = avatar;
        this.estadoCuenta = estadoCuenta;
    }

    public UsuarioEntidad() {
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
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

    public TipoDeCuentaEnum getEstadoCuenta() {
        return estadoCuenta;
    }
}