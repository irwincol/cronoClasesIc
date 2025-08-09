package models;

import java.time.LocalDateTime;

public class Actividad {
    private String id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaEntrega;
    private String estado;
    private int calificacion;
    private String tipo; // puede ser: tarea, proyecto, examen, etc.
    private String materia;
    private String profesorAsignado;

    // Constructor
    public Actividad(String id, String titulo, String descripcion, LocalDateTime fechaInicio, 
                    LocalDateTime fechaEntrega, String tipo, String materia, String profesorAsignado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = "Pendiente";
        this.calificacion = 0;
        this.tipo = tipo;
        this.materia = materia;
        this.profesorAsignado = profesorAsignado;
    }

    // Getters
    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public LocalDateTime getFechaInicio() { return fechaInicio; }
    public LocalDateTime getFechaEntrega() { return fechaEntrega; }
    public String getEstado() { return estado; }
    public int getCalificacion() { return calificacion; }
    public String getTipo() { return tipo; }
    public String getMateria() { return materia; }
    public String getProfesorAsignado() { return profesorAsignado; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFechaInicio(LocalDateTime fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaEntrega(LocalDateTime fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setMateria(String materia) { this.materia = materia; }
    public void setProfesorAsignado(String profesorAsignado) { this.profesorAsignado = profesorAsignado; }

}
