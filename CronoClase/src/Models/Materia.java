package Models;

import Models.Profesor;
import java.util.ArrayList;
import java.util.Arrays;


public class Materia {

    private String name;
    private Profesor profesor;
    private int semestre;

    private String horario;
    private ArrayList<Momento> momentos;



    public Materia(String name, Profesor profesor, int semestre, String horario, ArrayList<Momento> momentos) {
        this.name = name;
        this.profesor = profesor;
        this.semestre = semestre;
        this.horario = horario;
        this.momentos = new ArrayList<Momento>(momentos);
    }


    public Materia( Materia source){

        this.name = source.name;
        this.profesor = source.profesor;
        this.semestre =source.semestre;
        this.horario =source.horario;
        this.momentos=source.momentos;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Momento> getMomentos() {
        return new ArrayList<Momento>(this.momentos);
    }

    public void setMomentos(ArrayList<Momento> momentos) {
        this.momentos = new ArrayList<Momento>(momentos);
    }


    public String toString(){
        String result = "Materia: " + name + "\n";
        result += "Profesor: " + profesor.getName() + " (" + profesor.getEmail() + ")\n";
        result += "Semestre: " + semestre + "\n";
        result += "Horario: " + horario + "\n";
        result += "Momentos:\n";
        for(int i = 0; i < momentos.size(); i++){
            result += "  - " + momentos.get(i).getName() + " (Fecha: " + momentos.get(i).getDate() + ")\n";
        }
        return result;
    }
    
    public String imprimirDetallesCompletos(){
        String result = "=== DETALLES COMPLETOS DE LA MATERIA ===\n";
        result += "Nombre: " + name + "\n";
        result += "Profesor: " + profesor.getName() + "\n";
        result += "  Email: " + profesor.getEmail() + "\n";
        result += "  Programa: " + profesor.getPrograma() + "\n";
        result += "Semestre: " + semestre + "\n";
        result += "Horario: " + horario + "\n";
        result += "Número de Momentos: " + momentos.size() + "\n";
        result += "Momentos:\n";
        for(int i = 0; i < momentos.size(); i++){
            result += "  " + (i+1) + ". " + momentos.get(i).getName() + "\n";
            result += "     Fecha: " + momentos.get(i).getDate() + "\n";
            result += "     Actividades: " + momentos.get(i).getListaActividades().size() + "\n";
        }
        result += "=====================================\n";
        return result;
    }

    
}
