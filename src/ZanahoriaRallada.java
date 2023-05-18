public class ZanahoriaRallada extends Decorator{
    
    public ZanahoriaRallada(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Zanahoria Rallada";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}