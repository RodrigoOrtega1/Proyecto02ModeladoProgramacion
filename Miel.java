public class Miel extends Decorator{
    
    public Miel(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Miel";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}