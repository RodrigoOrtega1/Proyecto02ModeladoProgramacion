public class CremaDeCacahuate extends Decorator{
    
    public CremaDeCacahuate(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Crema De Cacahuate";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}
