public class RecorridoMediano implements Recorrido{
    @Override
    public String alimentar() {
        return "Alimentaras a los perros medianos";
    }

    @Override
    public String cepillar() {
        return "Cepillaras a los perros medianos";
    }

    @Override
    public String extra() {
        return "Pasearas a los perros medianos";
    }

    @Override
    public String recorrido() {
       return alimentar() + "\n" + cepillar() + "\n" + extra();
    }
}
