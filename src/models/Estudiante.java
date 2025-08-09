package models;

public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private String[] materias;

    // Constructor
    public Estudiante(String id, String nombre, String apellido, String correo, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.materias = new String[3]; // Array para 3 materias
        // Inicializamos el array con strings vacíos
        for (int i = 0; i < materias.length; i++) {
            materias[i] = "";
        }

    //     POR AQUI ME ENCONTRE ESTA FORMA DE AGREGAR LAS MATERIAS CON UN ARREGLO, PERO DEBO ESTUDIARLA MAS, LA OTRA FORMA DE INCLUIR
    //     LAS MATERIAS QUE PENSE ERA CON ATRIBUBOS DISTINTOS, POR EJEMPLO, PRIVATE STRING MATERIAUNA , PRIVATE ESTRING MATERIA2 Y ASI..
    // }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCorreo() { return correo; }
    public String getCarrera() { return carrera; }
    public String[] getMaterias() { return materias; }
    
    // Obtener una materia específica por índice (0, 1 o 2)
    public String getMateria(int index) {
        if (index >= 0 && index < materias.length) {
            return materias[index];
        }
        return null;
    }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    
    // Establecer una materia específica por índice (0, 1 o 2)
    public boolean setMateria(int index, String materia) {
        if (index >= 0 && index < materias.length) {
            materias[index] = materia;
            return true;
        }
        return false;
    }

    // Método para verificar si un estudiante tiene todas sus materias asignadas
    public boolean tieneTodasLasMaterias() {
        for (String materia : materias) {
            if (materia == null || materia.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}