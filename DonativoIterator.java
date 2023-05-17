import java.util.Iterator;

public class DonativoIterator {
    private ListaDonativos listaDonativos;
    public DonativoIterator(){
        listaDonativos = new ListaDonativos();
    }
    public Iterator getIteradorDonativos(){
        return listaDonativos.getIterator();
    }
}
