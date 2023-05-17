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
    public String getDescripcion(){
        return pastel.getDescripcion();
    }
    public int getCosto(){
        return pastel.getCosto();
    }
}
