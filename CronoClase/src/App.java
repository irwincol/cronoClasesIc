import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import Models.*;
import UseCases.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String Programa = "Desarrollo de Softwarre";
        int semestre = 1;

        String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
        String[] horas = { "Mañana", "Tarde", "Noche" };

        String h1 = dias[0] + "-" + dias[2] + "-" + horas[0];
        String h2 = dias[1] + "-" + dias[3] + "-" + horas[1];
        String h3 = dias[2] + "-" + dias[4] + "-" + horas[2];

        Profesor P1 = new Profesor("irwin", "irwin.col@cesde.net", Programa);
        Profesor P2 = new Profesor("Albani", "Albani.col@cesde.net", Programa);
        Profesor P3 = new Profesor("Mayito", "Mayito.col@cesde.net", Programa);

        Momento M1 = new Momento("Momento 1", new ArrayList<Actividades>(), LocalDate.parse("2025-08-16"));

        Momento M2 = new Momento("Momento 2", new ArrayList<Actividades>(), LocalDate.parse("2025-09-13"));

        Momento M3 = new Momento("Momento 3", new ArrayList<Actividades>(), LocalDate.parse("2025-10-11"));

        ArrayList<Momento> momentosS1 = new ArrayList<>(List.of(M1, M2, M3));

        Materia metodologia1 = new Materia("Metodolodigia", P1, semestre, h1, momentosS1);

        Scanner sc = new Scanner(System.in);

       ArrayList<Materia> materiasE1 = new ArrayList<>(List.of(metodologia1));


        Estudiante E1 = new Estudiante("1152717970","Paula", "Gil", "cualquier@gmail.com", Programa,materiasE1 );



        
        /***********************************************************************************************************************/

        System.out.print("Cuantas actividades desea ingresar: ");
        int numActividades = sc.nextInt();
        sc.nextLine();

        Materia materiaElegida = metodologia1;

        System.out.print("En cual de los momentos desea cargar actividades: ");
        int momentoElegido = sc.nextInt();
        Momento momentoSeleccionado = materiaElegida.getMomentos().get(momentoElegido-1);

        crearActividad actividadesNuevas = new crearActividad();

        for (int i = 0; i < numActividades; i++) {

            System.out.print("Ingrese la tarea # " + (i + 1));
            System.out.println("\n");

            System.out.print("Ingrese el nombre de la actividad: ");
            String nombreActividad = sc.nextLine();
            sc.nextLine();

            System.out.print("Ingrese la fecha de entrega la actividad (YYYY-MM-DD): ");
            String fechaDeEntrega = sc.nextLine();
            LocalDate fecha = LocalDate.parse(fechaDeEntrega);
            actividadesNuevas.create(nombreActividad, fecha, "asignada", materiaElegida);

            System.out.println("\n");

        }

        materiaElegida.getMomentos().get(momentoElegido).setListaActividades(actividadesNuevas.getListaAactividades());


        E1.VisualizarMaterias();
        
        // Imprimir detalles completos de la materia "metodologia"
        System.out.println("\n=== IMPRIMIENDO DETALLES COMPLETOS DE LA MATERIA METODOLOGIA ===");
        System.out.println(metodologia1.imprimirDetallesCompletos());


    }
}