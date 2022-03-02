package com.hotels17.servicioreservas.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "numero_huespedes")
    private Integer numeroHuespedes;

    @Column(name = "fecha_entrada")
    private Date fechaEntrada;

    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @Column(name = "precio_total")
    private Double precioTotal;

    private Boolean desayuno;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idHabitacion, Integer idUsuario, Integer numeroHuespedes, Date fechaEntrada, Date fechaSalida, Double precioTotal, Boolean desayuno) {
        this.id = id;
        this.idHabitacion = idHabitacion;
        this.idUsuario = idUsuario;
        this.numeroHuespedes = numeroHuespedes;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precioTotal = precioTotal;
        this.desayuno = desayuno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getNumeroHuespedes() {
        return numeroHuespedes;
    }

    public void setNumeroHuespedes(Integer numeroHuespedes) {
        this.numeroHuespedes = numeroHuespedes;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Boolean getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(Boolean desayuno) {
        this.desayuno = desayuno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return id.equals(reserva.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idHabitacion=" + idHabitacion +
                ", idUsuario=" + idUsuario +
                ", numeroHuespedes=" + numeroHuespedes +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", precioTotal=" + precioTotal +
                ", desayuno=" + desayuno +
                '}';
    }
}
