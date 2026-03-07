package org.DavidParada.modelo.formulario;

import org.DavidParada.modelo.enums.PaisEnum;
import org.DavidParada.modelo.enums.TipoDeCuentaEnum;
import java.time.Instant;
import java.time.LocalDate;

public class UsuarioForm {
    private String nombreUsuario;
    private String nombreReal;
    private String email;
    private String password;
    private PaisEnum pais;
    private LocalDate fechaNacimiento;
    private Instant fechaRegistro;
    private String avatar;
    private TipoDeCuentaEnum tipoDeCuentaEnum;

    public UsuarioForm() {
    }

    public UsuarioForm(String nombreUsuario,
                       String nombreReal,
                       String email,
                       String password,
                       PaisEnum pais,
                       LocalDate fechaNacimiento,
                       Instant fechaRegistro,
                       TipoDeCuentaEnum tipoDeCuentaEnum) {

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


