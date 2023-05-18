public class RecorridoCachorro implements Recorrido {

    @Override
    public String alimentar() {
        return "Alimentaras a cachorros";
    }

    @Override
    public String cepillar() {
        return "Cepillaras a los cachorros";
    }

    @Override
    public String extra() {
        return "Jugaras con los cachorros";
    }

    @Override
    public String recorrido() {
       return alimentar() + "\n" + cepillar() + "\n" + extra();
    }
}
