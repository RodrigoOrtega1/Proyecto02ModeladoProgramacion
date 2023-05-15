public class ManzanaRallada extends Decorator{
    
    public ManzanaRallada(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Manzana Rallada";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}

