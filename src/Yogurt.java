public class Yogurt extends Decorator{
    
    public Yogurt(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Yogurt";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}