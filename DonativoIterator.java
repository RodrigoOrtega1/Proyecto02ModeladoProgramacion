import java.util.Iterator;

public class DonativoIterator {
    private ListaDonativos listaDonativos;
    
    /**
     * Constructor de DonativoIterator
     */
    public DonativoIterator(){
        listaDonativos = new ListaDonativos();
    }

    /**
     * Obtiene el iterador de la listaDonativos
     * @return iterador de listaDonativos
     */
    public Iterator getIteradorDonativos(){
        return listaDonativos.getIterator();
    }
}
