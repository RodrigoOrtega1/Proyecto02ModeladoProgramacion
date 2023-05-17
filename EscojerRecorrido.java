import java.util.Scanner;

public class EscojerRecorrido {
    public void escojerRecorrido(){
        Scanner scanner = new Scanner(System.in);
        Recorrido recorrido;
        System.out.println("Por favor escoja el tipo de recorrido que desee programar:");
        System.out.println("[1] Recorrido con cachorros");
        System.out.println("[2] Recorrido con perros de medianos");
        System.out.println("[3] Recorrido con perros grandes");
        int userInput = scanner.nextInt();
        switch(userInput){
            case 1: recorrido = new RecorridoCachorro(); System.out.println(recorrido.recorrido()); break;
            case 2: recorrido = new RecorridoMediano(); System.out.println(recorrido.recorrido()); break; 
            case 3: recorrido = new RecorridoGrande(); System.out.println(recorrido.recorrido()); break;
            default: System.out.println("Inserte un valor valido");
        }
    }
}
