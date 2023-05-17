import java.util.LinkedList;
import java.util.Iterator;

public class ListaDePerros {
    private LinkedList<Perro> listaDePerros = new LinkedList<>();
    
    /**
     * Constructor de ListaDePerros
     */
    public ListaDePerros(){
        inicializar();
    }

    /**
     * Regresa la lista de perros
     * @return
     */
    public LinkedList<Perro> getLista(){
        return listaDePerros;
    }

    /**
     * Llena la lista con objetos tipo perro
     */
    public void inicializar(){
        listaDePerros.add(new Perro("Fido", 2, "Mediano", "Mestizo", "Alegre", true));
        listaDePerros.add(new Perro("Luna", 1, "Pequena", "Pomerania", "Inteligente", true));
        listaDePerros.add(new Perro("Max", 3, "Grande", "Pastor Ingles", "Carinoso", true));
        listaDePerros.add(new Perro("Ron", 1, "Pequeno", "Westie", "Travieso", true));
        listaDePerros.add(new Perro("Atena", 4, "Grande", "Alaska", "Tranquila", true));
        listaDePerros.add(new Perro("Sam", 2, "Mediano", "Terrier", "Huranio", true));
        listaDePerros.add(new Perro("Miel", 1, "Mediano", "Beagle", "Jugueton", true));
        listaDePerros.add(new Perro("Flor", 2, "Pequena", "Chihuahua", "Floja", true));
        listaDePerros.add(new Perro("Uva", 2, "Mediana", "Schnauzer", "Timida", true));
        listaDePerros.add(new Perro("Toby", 1, "Chico", "Sabueso", "Explorador", true));
        listaDePerros.add(new Perro("Luneta", 3, "Mediana", "Mestiza", "Activa", true));
        listaDePerros.add(new Perro("Rocky", 5, "Mediano", "Mestizo", "Tranquilo", true));
        listaDePerros.add(new Perro("Milo", 7, "Grande", "Mestizo", "Carinoso", true));
        listaDePerros.add(new Perro("Canela", 4, "Pequena", "Chihuahua", "Curiosa", true));
        listaDePerros.add(new Perro("Princesa", 7, "Grande", "Labrador", "Carinosa", true));
        listaDePerros.add(new Perro("Lassie", 1, "Mediana", "Mestiza", "Juguetona", true));
        listaDePerros.add(new Perro("Maya", 3, "Chica", "Mestiza", "Creativa", true));
        listaDePerros.add(new Perro("Coco", 6, "Mediano", "Mestizo", "Activo", true));
        listaDePerros.add(new Perro("Lola", 1, "Grande", "Mestiza", "Alegre", true));
        listaDePerros.add(new Perro("Oso", 2, "Grande", "Mestizo", "Inteligente", true));
    }

    /**
     * Regresa el iterador de la lista de perros
     * @return iterador de la lista de perros
     */
    public Iterator getIterator(){
        return listaDePerros.iterator();
    }
}
