package ProyectoColaborativo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public long calcularTiempoTotalInvertido() {
        return tareas.stream().mapToLong(Tarea::calcularTiempoInvertido).sum();
    }

    public void generarInformeProgreso() {
        System.out.println("Informe de Progreso del Proyecto: " + nombre);
        System.out.println("------------------------------------");
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.descripcionTarea());
            System.out.println("Responsable: " + tarea.getResponsable().getNombre());
            System.out.println("Duracion: " + tarea.calcularTiempoInvertido() + " dias");
            System.out.println("--------------------------------------------------");
        }
        System.out.println("Tiempo Total Invertido: " + calcularTiempoTotalInvertido() + " dias");
    }
}