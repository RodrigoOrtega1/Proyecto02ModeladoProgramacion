import java.util.LinkedList;
import java.util.Iterator;

public class ListaDonativos {
    private LinkedList<Donativo> listaDonativos = new LinkedList<>();
    
    /**
     * Constructor de lista de donativos
     */
    public ListaDonativos(){
        inicializar();
    }

    /**
     * Regresa la lista de donativos
     * @return lista de donativos
     */
    public LinkedList<Donativo> getLista(){
        return listaDonativos;
    }

    /**
     * Llena la lista de donativos con donativos
     */
    public void inicializar(){
        listaDonativos.add(new Donativo("Alimento", "130", 1));
        listaDonativos.add(new Donativo("Premios", "140", 2));
        listaDonativos.add(new Donativo("Pelota", "50", 3));
        listaDonativos.add(new Donativo("Hueso de jugete", "50", 4));
        listaDonativos.add(new Donativo("Jugete chillon", "50", 5));
    }

    /**
     * Regresa el iterador de la lista de donativos
     * @return iterador de la lista de donativos
     */
    public Iterator getIterator(){
        return listaDonativos.iterator();
    }
}