public class Donativo {
    /**
     * Nombre del donativo
     */
    private String nombre;
    
    /**
     * Precio del donativo
     */
    private String precio;
    
    /**
     * Identificador del donativo
     */
    private int identificador;

    /**
     * Define el estado inicial del donativo.
     * @param nombre del donativo
     * @param precio del donativo
     * @param identificador del donativo
     */
    public Donativo(String nombre, String precio, int identificador){
        this.nombre = nombre;
        this.precio = precio;
        this.identificador = identificador;
    }

    /**
     * Metodo get que devuelve el nombre del donativo
     * @return nombre el nombre del donativo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter para establecer el nombre del donativo
     * @param nombre el nombre del donativo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get que devuelve el precio del donativo
     * @return nombre el precio del donativo
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Metodo setter para establecer el precio del donativo
     * @param precio el precio del donativo
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Metodo get que devuelve el identificador del donativo
     * @return identificador el identificador del donativo
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Metodo setter para establecer el identificador del donativo
     * @param identificador el identificador del donativo
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
