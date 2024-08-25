package ProyectoColaborativo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TareaDesarrollo extends Tarea {
    public TareaDesarrollo(String nombre, LocalDate fechaInicio, LocalDate fechaFin, Responsable responsable) {
        super(nombre, fechaInicio, fechaFin, responsable);
    }

    @Override
    public String descripcionTarea() {
        return "Desarrollo de software: " + getNombre();
    }
}