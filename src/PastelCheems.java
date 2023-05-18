public class PastelCheems implements Pastel {
    private String descripcion;
    private int costo;
    public PastelCheems(){
        descripcion = "Harina de avena";
        costo = 1;
    }

    /**
     * Regresa la descripcion del pastel
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Cambia la descripcion del pastel
     * @param descripcion descripcion del pastel
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Regresa el costo del pastel
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Establece el costo del pastel
     * @param costo costo del pastel
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }    
}
