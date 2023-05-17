public abstract class Decorator implements Pastel{
    /**
     * Objeto tipo Pastel
     */
    protected Pastel pastel;
    
    /**
     * Constructor por defecto de Decorator
     * @param pastel
     */
    public Decorator(Pastel pastel){
        this.pastel = pastel;
    }
    /**
     * Regresa la descripcion del pastel
     */
    public String getDescripcion(){
        return pastel.getDescripcion();
    }
    /**
     * Regresa el costo del pastel
     */
    public int getCosto(){
        return pastel.getCosto();
    }
}
