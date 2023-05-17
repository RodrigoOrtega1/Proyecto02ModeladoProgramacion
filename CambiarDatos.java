import java.util.Scanner;

public class CambiarDatos {
    public void cambiarDatos(ClienteProxy c){
        System.out.println("Elija que informacion desea cambiar");
        System.out.println("[1] Contrasena");
        System.out.println("[2] Telefono");
        System.out.println("[3] Cuenta Bancaria");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.nextLine();
        String nuevaInformacion;
        switch(userInput){
            case 1:
                System.out.println("Inserte su nueva contrasena: ");
                nuevaInformacion = scanner.nextLine();
                c.setContrasena(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            case 2:
                System.out.println("Inserte su nuevo telefono: ");
                nuevaInformacion = scanner.nextLine();
                c.setTelefono(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            case 3:
                System.out.println("Inserte su nueva cuenta bancaria");
                nuevaInformacion = scanner.nextLine();
                c.setCuentaBancaria(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            default: System.out.println("Por favor inserte un valor correcto");
        }
    }
}
