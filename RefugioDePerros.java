import java.util.Iterator;
import java.util.Scanner;

public class RefugioDePerros {
    PerrosIterator perrosIterador = new PerrosIterator();
    Iterator iteratorP = perrosIterador.getIteradorPerros();
    TiendaDePasteles tiendaDePasteles = new TiendaDePasteles();
    EscojerRecorrido escojerRecorrido = new EscojerRecorrido();
    
    public void mostrarPerros(){
        Perro perro = null;
        PerroView perroView = new PerroView();
        while(iteratorP.hasNext()){
            perro = (Perro) iteratorP.next();
            PerroController perroController = new PerroController(perro, perroView);
            perroController.updatePerroView();
            System.out.println("----");
        }
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        switch(userInput){
            case 1: mostrarPerros(); break;
            case 2: tiendaDePasteles.tiendaDePasteles(); break;
            case 3: escojerRecorrido.escojerRecorrido(); break;
        }
    }

    public static void main(String[] args){
        RefugioDePerros refugioDePerros = new RefugioDePerros();
        refugioDePerros.menu();
    }
}
