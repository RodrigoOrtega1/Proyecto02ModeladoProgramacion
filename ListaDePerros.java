import java.util.LinkedList;
import java.util.Iterator;

public class ListaDePerros {
    private LinkedList<Perro> listaDePerros = new LinkedList<>();
    public ListaDePerros(){
        inicializar();
    }

    public LinkedList<Perro> getLista(){
        return listaDePerros;
    }

    public void inicializar(){
        listaDePerros.add(new Perro("Fido", 2, "Mediano", "Mestizo", "Alegre", true));
        listaDePerros.add(new Perro("Luna", 1, "Pequeno", "Pomeranio", "Inteligente", true));
        listaDePerros.add(new Perro("Max", 3, "Grande", "Pastor Ingles", "Carinoso", true));
    }

    public Iterator getIterator(){
        return listaDePerros.iterator();
    }
}
