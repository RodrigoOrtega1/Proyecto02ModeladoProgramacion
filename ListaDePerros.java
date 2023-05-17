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
        listaDePerros.add(new Perro("Ron", 1, "Pequeno", "Westie", "Travieso", true));
        listaDePerros.add(new Perro("Atena", 4, "Grande", "Alaska", "Tranquila", true));
        listaDePerros.add(new Perro("Sam", 2, "Mediano", "Terrier", "Huranio", true));
        listaDePerros.add(new Perro("Miel", 1, "Mediano", "Beagle", "Jugueton", true));
        listaDePerros.add(new Perro("Flor", 2, "Pequeno", "Chihuahua", "Floja", true));
        listaDePerros.add(new Perro("Uva", 2, "Mediano", "Schnauzer", "Timida", true));
    }

    public Iterator getIterator(){
        return listaDePerros.iterator();
    }
}
