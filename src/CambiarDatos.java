import java.util.Scanner;

public class CambiarDatos {
    /**
     * Metodo para que el usuario cambie datos personales
     * @param c Representa al usuario
     */
    public void cambiarDatos(ClienteProxy c){
        Scanner scanner = new Scanner(System.in);
        String nuevaInformacion;
        int userInput;
        String message;
        while(true){
            try {
                System.out.println("Elija que informacion desea cambiar");
                System.out.println("[1] Contrasena");
                System.out.println("[2] Telefono");
                System.out.println("[3] Cuenta Bancaria");
                userInput = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor inserte un valor valido");
            }
        }
        scanner.nextLine();
        switch(userInput){
            case 1:
                message = "Inserte su nueva contrasena:";
                nuevaInformacion = cacharErrorString(scanner, message);
                c.setContrasena(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            case 2:
                message = "Inserte su nuevo telefono:";
                nuevaInformacion = cacharErrorString(scanner, message);
                c.setTelefono(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            case 3:
                message = "Inserte su nueva cuenta bancaria:";
                nuevaInformacion = cacharErrorString(scanner, message);
                c.setCuentaBancaria(nuevaInformacion);
                System.out.println("Informacion actualizada exitosamente");
                break;
            default: System.out.println("Por favor inserte un valor correcto");
        }
    }

    /**
     * Checa que los valores insertados sean validos
     * @param scanner donde entran los datos
     * @param message mensaje a mostrar
     * @return la cadena si es valida
     */
    private String cacharErrorString(Scanner scanner, String message){
        while(true){
            try {
                System.out.println(message);
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor inserte un valor valido");
            }
        }
    }
}
