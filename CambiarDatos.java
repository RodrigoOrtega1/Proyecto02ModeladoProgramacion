import java.util.Scanner;

public class CambiarDatos {
    public void cambiarDatos(ClienteProxy c){
        System.out.println("""
                Elija que informacion personal desea editar:
                [1] Contrasena
                [2] Telefono
                [3] Cuenta Bancaria
                """);
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

    public static void main(String[] args){
        Cliente cliente = new Cliente("Eduardo", "123", "231-323", "VAC213ADD");
        ClienteProxy proxy = new ClienteProxy(cliente);
        CambiarDatos cambiarDatos = new CambiarDatos();
        cambiarDatos.cambiarDatos(proxy);
        System.out.print(proxy.getContrasena() + " " + proxy.getCuentaBancaria() + " " + proxy.getTelefono());
    }
}
