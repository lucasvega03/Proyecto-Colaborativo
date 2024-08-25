package ProyectoColaborativo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TareaPruebas extends Tarea {
    public TareaPruebas(String nombre, LocalDate fechaInicio, LocalDate fechaFin, Responsable responsable) {
        super(nombre, fechaInicio, fechaFin, responsable);
    }

    @Override
    public String descripcionTarea() {
        return "Pruebas de software: " + getNombre();
    }
}