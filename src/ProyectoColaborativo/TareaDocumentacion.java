package ProyectoColaborativo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TareaDocumentacion extends Tarea {
    public TareaDocumentacion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, Responsable responsable) {
        super(nombre, fechaInicio, fechaFin, responsable);
    }

    @Override
    public String descripcionTarea() {
        return "Documentacion del proyecto: " + getNombre();
    }
}