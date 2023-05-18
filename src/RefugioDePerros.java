import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class RefugioDePerros {
    HashMap<String, Cliente> baseDeClientes = new HashMap<>();
    PerrosIterator perrosIterador = new PerrosIterator();
    Iterator iteratorP = perrosIterador.getIteradorPerros();
    TiendaDePasteles tiendaDePasteles = new TiendaDePasteles();
    EscojerRecorrido escojerRecorrido = new EscojerRecorrido();
    LinkedList<Perro> listaDePerros = new LinkedList<>();
    Donar donar = new Donar();
    CambiarDatos cambiarDatos = new CambiarDatos();
    
    /**
     * Checa si el cliente existe
     * @return Si el cliente existe, lo regresa
     */
    public Cliente validarUsuario(){
        Scanner scanner = new Scanner(System.in);
        Cliente c = new Cliente(null, null, null, null);
        boolean usuarioValido = false;
        while(!usuarioValido){
            System.out.println("Ingrese su usuario");
            String usuarioIngresado = scanner.nextLine();
            System.out.println("Ingrese su contrasena");
            String contrasenaIngresada = scanner.nextLine();
            if(baseDeClientes.containsKey(usuarioIngresado) && baseDeClientes.get(usuarioIngresado).getContrasena().equals(contrasenaIngresada)){
                System.out.println("bienvenido de vuelta");
                c = baseDeClientes.get(usuarioIngresado);
                usuarioValido = true;
            } else {
                System.out.println("ese usuario no existe");
                continue;
            }
        }
        return c;
    }

    /**
     * Muestra al usuario a todos los perros
     */
    public void populatePerros(){
        while(iteratorP.hasNext()){
            Perro perro = (Perro) iteratorP.next();
            listaDePerros.add(perro);
        }
    }

    public void mostrarPerros(){
        populatePerros();
        PerroView perroView = new PerroView();
        for(Perro p : listaDePerros){
            PerroController perroController = new PerroController(p, perroView);
            perroController.updatePerroView();
            System.out.println("----");
        }
    }

    /**
     * Menu para que el usuario interactue con el programa
     * @param c el usuario
     */
    public void menu(ClienteProxy c){
        Scanner scanner = new Scanner(System.in);
        int counter = 10;
        int userInput;
        while(counter != 0){
            while(true){
                try{
                    System.out.println("Bienvenido al Refugio Cheems elija una opcion:");
                    System.out.println("[1] Mostrar a los perros en adopcion.");
                    System.out.println("[2] Tienda de pasteles.");
                    System.out.println("[3] Programar un recorrido.");
                    System.out.println("[4] Realizar una donacion.");
                    System.out.println("[5] Editar datos personales.");
                    System.out.println("[0] Salir");    
                    userInput = Integer.parseInt(scanner.next());
                    break;
                } catch (Exception e){
                    System.out.println("Por favor inserte un valor valido");
                }
            }
            switch(userInput){
                case 1: mostrarPerros(); break;
                case 2: tiendaDePasteles.tiendaDePasteles(); break;
                case 3: escojerRecorrido.escojerRecorrido(); break;
                case 4: donar.donar(); break;
                case 5: cambiarDatos.cambiarDatos(c); break;
                case 0: counter = 0; break;
                default: System.out.println("Por favor insertar un valor valido");
            }
        }
    }

    /**
     * Muestra la pantalla de iniciar sesion
     */
    public void pantallaPrincipal(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int userInput;
        while(counter != 2){
            while(true){
                try{
                    System.out.println("[1] Iniciar sesion");
                    System.out.println("[2] Salir");
                    userInput = Integer.parseInt(scanner.next());
                    break;
                } catch (Exception e){
                    System.out.println("Por favor inserte un valor valido");
                }
            }
            switch(userInput){
            case 1:
                Cliente c = validarUsuario();
                ClienteProxy proxy = new ClienteProxy(c);
                menu(proxy);
                break;
            case 2: counter = 2; break;
            default: System.out.println("Por favor insertar un valor valido");
            }
        }
    }
}
