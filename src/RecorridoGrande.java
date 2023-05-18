public class RecorridoGrande implements Recorrido{
    @Override
    public String alimentar() {
        return "Alimentaras a los perros grandes";
    }

    @Override
    public String cepillar() {
        return "Cepillaras a los perros grandes";
    }

    @Override
    public String extra() {
        return "Veras una carrera de obstaculos";
    }

    @Override
    public String recorrido() {
       return alimentar() + "\n" + cepillar() + "\n" + extra();
    }
    
}
