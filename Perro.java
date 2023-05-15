public class Perro {
    /**
     * Nombre del perro
     */
    private String nombre;
    /**
     * Edad del perro
     */
    private int edad;
    /**
     * Tamano del perro
     */
    private String tamano;
    /**
     * Raza del perro
     */
    private String raza;
    /**
     * Descripcion del perro
     */
    private String descripcion;
    /**
     * Disponibilidad del perro
     */
    private boolean enAdopcion;
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getTamano() {
        return tamano;
    }
    public String getRaza() {
        return raza;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isEnAdopcion() {
        return enAdopcion;
    }
}