import java.util.Iterator;

public class PerrosIterator {
    private ListaDePerros listaDePerros;

    public PerrosIterator(){
        listaDePerros = new ListaDePerros();
    }

    public Iterator getIteradorPerros(){
        return listaDePerros.getIterator();
    }
}
