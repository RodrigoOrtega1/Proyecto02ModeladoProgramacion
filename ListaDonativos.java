import java.util.LinkedList;
import java.util.Iterator;

public class ListaDonativos {
    private LinkedList<Donativo> listaDonativos = new LinkedList<>();
    public ListaDonativos(){
        inicializar();
    }

    public LinkedList<Donativo> getLista(){
        return listaDonativos;
    }

    public void inicializar(){
        listaDonativos.add(new Donativo("Alimento", "130", 1));
        listaDonativos.add(new Donativo("Premios", "140", 2));
        listaDonativos.add(new Donativo("Pelota", "50", 3));
        listaDonativos.add(new Donativo("Hueso de jugete", "50", 4));
        listaDonativos.add(new Donativo("Jugete chillon", "50", 5));
    }

    public Iterator getIterator(){
        return listaDonativos.iterator();
    }
}