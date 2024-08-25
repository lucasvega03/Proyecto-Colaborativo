package ProyectoColaborativo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Responsable responsable1 = new Responsable("Font Juan Ignacio");
        Responsable responsable2 = new Responsable("Font Miguel Geronimo");

        Proyecto proyecto = new Proyecto("Proyecto Colaborativo");

        Tarea tarea1 = new TareaDesarrollo("Desarrollar modulo de autenticacion", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 10), responsable1);
        Tarea tarea2 = new TareaPruebas("Pruebas del modulo de autenticacion", LocalDate.of(2023, 8, 11), LocalDate.of(2023, 8, 15), responsable2);
        Tarea tarea3 = new TareaDocumentacion("Documentar el proyecto", LocalDate.of(2023, 8, 16), LocalDate.of(2023, 8, 18), responsable1);

        proyecto.agregarTarea(tarea1);
        proyecto.agregarTarea(tarea2);
        proyecto.agregarTarea(tarea3);

        proyecto.generarInformeProgreso();
    }
}