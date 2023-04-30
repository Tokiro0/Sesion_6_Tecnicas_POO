package asociaciones.entidades;

/**
 *
 * @author tokiro
 */
public class Curso {

    private Estudiante[] estudiantes;
    private String codigo;
    private Integer creditos;
    private Profesor[] profesores;
    private String nombre;

    public Curso(
            String codigo,
            Integer creditos,
            String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
        this.estudiantes = new Estudiante[30];
        this.profesores = new Profesor[2];
    }

    public Curso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarProfesor(Profesor profesor) {
    }

    public void agregarEstudiante(Estudiante estudiante) {
    }

    /**
     * @return the estudiantes
     */
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    /**
     * @param estudiantes the estudiantes to set
     */
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the creditos
     */
    public Integer getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the profesores
     */
    public Profesor[] getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
