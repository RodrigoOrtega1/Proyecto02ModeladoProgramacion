import java.util.Scanner;

public class EscojerRecorrido {
    public void escojerRecorrido(){
        Scanner scanner = new Scanner(System.in);
        Recorrido recorrido;
        int userInput;
        while(true){
            try{
                System.out.println("Por favor escoja el tipo de recorrido que desee programar:");
                System.out.println("[1] Recorrido con cachorros");
                System.out.println("[2] Recorrido con perros de medianos");
                System.out.println("[3] Recorrido con perros grandes");
                userInput = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor inserte un valor valido");
            }
        }
        switch(userInput){
            case 1: recorrido = new RecorridoCachorro(); mensajeDelRecorrido(recorrido); break;
            case 2: recorrido = new RecorridoMediano(); mensajeDelRecorrido(recorrido); break; 
            case 3: recorrido = new RecorridoGrande(); mensajeDelRecorrido(recorrido); break;
            default: System.out.println("Inserte un valor valido");
        }
    }

    private void mensajeDelRecorrido(Recorrido recorrido){
        System.out.println("--- Gracias por programar un recorrido con Refugio Cheems ---");
        System.out.println("Te esperamos con alegria el dia 29-5-2023");
        System.out.println("En tu visita podras:");
        System.out.println(recorrido.recorrido());
        System.out.println("----");
    }
}
