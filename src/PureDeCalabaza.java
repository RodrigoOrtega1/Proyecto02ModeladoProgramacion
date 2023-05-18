public class PureDeCalabaza extends Decorator{
    
    public PureDeCalabaza(Pastel pastel){
        super(pastel);
    }

    @Override
    public String getDescripcion() {
        return pastel.getDescripcion() + ", Pure De Calabaza";
    }

    @Override
    public int getCosto() {
        return pastel.getCosto() + 1;
    }
}