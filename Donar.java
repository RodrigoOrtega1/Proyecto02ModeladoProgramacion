import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Donar {
    DonativoIterator donativoIterator = new DonativoIterator();
    Iterator iterator = donativoIterator.getIteradorDonativos();
    LinkedList<Donativo> listaDeDonativos = new LinkedList<>();
    LinkedList<Donativo> productosDonados = new LinkedList<>();

    public void populateList(){
        while(iterator.hasNext()){
            Donativo donativo = (Donativo) iterator.next();
            listaDeDonativos.add(donativo);
        }
    }

    public void donar(){
        populateList();
        DonativoView donativoView = new DonativoView();
        for(Donativo d : listaDeDonativos){
            DonativoController donativoController = new DonativoController(d, donativoView);
            donativoController.updateDonativoView();
            System.out.println("----");
        }
        System.out.println("Inserte el codigo del producto que desee donar, presione 0 para terminar de donar:");
        Scanner scanner = new Scanner(System.in);
        boolean isOver = false;
        int userInput;
        while(!isOver){
            while(true){
                try{
                    userInput = Integer.parseInt(scanner.next());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Por favor inserte un valor valido");
                }
            }
            if(userInput == 0){
                isOver = true;
                break;
            }
            if(userInput > listaDeDonativos.size() || userInput < 0){
                System.out.println("Ese elemento no existe");
                continue;
            }
            productosDonados.add(listaDeDonativos.get(userInput - 1));
        }
        System.out.println("Gracias por tu apoyo!:");
        for(Donativo d : productosDonados){
            DonativoController donativoController = new DonativoController(d, donativoView);
            donativoController.updateDonativoView();
            System.out.println("----");
        }
    }   
}
