import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TiendaDePasteles {
    public void tiendaDePasteles(){
        boolean isOver = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> orden = new ArrayList<>();
        Pastel pastel = new PastelCheems();
        int userInput;
        while(!isOver){
            while(true){
                try {
                    System.out.println("Personalize su pastel");
                    System.out.println("[1] Zanahoria Rallada");
                    System.out.println("[2] Manzana Rallada");
                    System.out.println("[3] Miel");
                    System.out.println("[4] Yogurt");
                    System.out.println("[5] Crema de cacahuate");
                    System.out.println("[6] Pure de calabaza");
                    System.out.println("[7] Terminar orden");
                    userInput = Integer.parseInt(scanner.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor inserte un valor valido");
                } 
            } 

            if (Collections.frequency(orden, userInput) > 2){
                System.out.println("Solo puedes pedir hasta 3 de un ingrediente");
                continue;
            }

            switch(userInput){
                case 1:
                    orden.add(userInput);
                    pastel = new ZanahoriaRallada(pastel);
                    break;
                case 2:
                    orden.add(userInput);    
                    pastel = new ManzanaRallada(pastel);
                    break;
                case 3:
                    orden.add(userInput);
                    pastel = new Miel(pastel);
                    break;
                case 4:
                    orden.add(userInput);
                    pastel = new Yogurt(pastel);
                    break;
                case 5:
                    orden.add(userInput);
                    pastel = new CremaDeCacahuate(pastel);
                    break;
                case 6:
                    orden.add(userInput);
                    pastel = new PureDeCalabaza(pastel);
                    break;
                case 7:
                    System.out.println("Ticket:\n" + "Su orden:\n" + pastel.getDescripcion() + "\n" +  "Costo total:\n" + pastel.getCosto() + "\n Gracias por su apoyo!");
                    isOver = true;
                    break;
                default:
                    System.out.println("Por favor inserte un valor valido");
                    break;
            }  
        }
    }
}
