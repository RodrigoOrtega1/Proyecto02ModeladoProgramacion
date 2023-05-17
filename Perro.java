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
     * Si un perro puede ser adoptado
     */
    private boolean enAdopcion;

    /**
     * Define el estado inicial de un perro.
     * @param nombre del perro
     * @param edad del perro
     * @param tamano del perro
     * @param raza del perro
     * @param descripcion del perro
     * @param enAdopcion si el perro puede ser adoptado
     */
    public Perro(String nombre, int edad, String tamano, String raza, String descripcion, boolean enAdopcion){
        this.nombre = nombre;
        this.edad = edad;
        this.tamano = tamano;
        this.raza = raza;
        this.descripcion = descripcion;
        this.enAdopcion = enAdopcion;
    }
    
    /**
     * Metodo que regresa el nombre del perro
     * @return nombre del perro
     */
    public String getNombre() {
        return nombre;
    } 
    
    /**
     * Metodo que regresa la edad del perro
     * @return edad del perro
     */
    public int getEdad() {
        return edad;
    }
   
    /**
     * Metodo que regresa el tamano del perro
     * @return tamano del perro
     */
    public String getTamano() {
        return tamano;
    }
    
    /**
     * Metodo que regresa la raza del perro
     * @return raza del perro
     */
    public String getRaza() {
        return raza;
    }
    
    /**
     * Metodo que regresa la descripcion del perro
     * @return descripcion del perro
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Metodo que devuelve si un perro puede ser adoptado o no
     * @return enAdopcion si un perro puede ser adoptado o no
     */
    public boolean isEnAdopcion() {
        return enAdopcion;
    }
    
    /**
     * Metodo setter para establecer el nombre del perro
     * @param nombre el nombre del perro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Metodo setter para establecer la edad del perro
     * @param edad la edad del perro
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /**
     * Metodo setter para establecer el tamano del perro
     * @param tamano el tamano del perro
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    
    /**
     * Metodo setter para establecer la raza del perro
     * @param edad la raza del perro
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    /**
     * Metodo setter para establecer la descripcion del perro
     * @param descripcion la descripcion del perro
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo setter para establecer si un perro puede ser adoptado o no
     * @param enAdopcion si un perro puede ser adoptado o no
     */
    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }
}
