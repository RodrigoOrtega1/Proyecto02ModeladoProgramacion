public abstract class Decorator implements Pastel{
    protected Pastel pastel;
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