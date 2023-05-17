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
        while(!isOver){
            int userInput = scanner.nextInt();
            if(userInput == 0){
                isOver = true;
                break;
            }
            productosDonados.add(listaDeDonativos.get(userInput - 1));
        }
        System.out.println("Gracias por haber donado: ");
        for(Donativo d : productosDonados){
            DonativoController donativoController = new DonativoController(d, donativoView);
            donativoController.updateDonativoView();
            System.out.println("----");
        }
    }

    public static void main(String[] args){
        Donar donar = new Donar();
        donar.donar();        
    }
}
