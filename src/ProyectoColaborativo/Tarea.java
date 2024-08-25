package ProyectoColaborativo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Tarea {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Responsable responsable;

    public Tarea(String nombre, LocalDate fechaInicio, LocalDate fechaFin, Responsable responsable) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public long calcularTiempoInvertido() {
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public abstract String descripcionTarea();
}