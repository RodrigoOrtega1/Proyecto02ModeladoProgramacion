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
     * Constructor definido de donativo
     * @param nombre nombre del producto a donar
     * @param precio precio del producto
     * @param identificador identifica a el producto
     */
    public Donativo(String nombre, String precio, int identificador){
        this.nombre = nombre;
        this.precio = precio;
        this.identificador = identificador;
    }

    /**
     * Regresa el nombre del producto
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el precio del producto
     * @return precio del producto
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     * @param precio precio del producto
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * Regresa el identificador del producto
     * @return identificador del producto
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Establece el identificador del producto
     * @param identificador identificador del producto
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
