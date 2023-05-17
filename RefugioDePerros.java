import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RefugioDePerros {
    HashMap<String, Cliente> baseDeClientes = new HashMap<>();
    PerrosIterator perrosIterador = new PerrosIterator();
    Iterator iteratorP = perrosIterador.getIteradorPerros();
    TiendaDePasteles tiendaDePasteles = new TiendaDePasteles();
    EscojerRecorrido escojerRecorrido = new EscojerRecorrido();
    Donar donar = new Donar();
    CambiarDatos cambiarDatos = new CambiarDatos();
    
    public Cliente validarUsuario(){
        Scanner scanner = new Scanner(System.in);
        Cliente c = new Cliente(null, null, null, null);
        boolean usuarioValido = false;
        while(!usuarioValido){
            System.out.println("Ingrese su usuario");
            String usuarioIngresado = scanner.nextLine();
            System.out.println("Ingrese su contraseña");
            String contraseñaIngresada = scanner.nextLine();
            if(baseDeClientes.containsKey(usuarioIngresado) && baseDeClientes.get(usuarioIngresado).getContrasena().equals(contraseñaIngresada)){
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

    public void menu(ClienteProxy c){
        Scanner scanner = new Scanner(System.in);
        int counter = 10;
        while(counter != 0){
            System.out.println("""
                Bienvenido al Refugio Cheems elija una opcion:
                [1] Mostrar a los perros en adopcion.
                [2] Tienda de pasteles.
                [3] Programar un recorrido.
                [4] Realizar una donacion.
                [5] Editar datos personales.
                [0] Salir
                """);
            int userInput = scanner.nextInt();
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

    public void pantallaPrincipal(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(counter != 0){
            System.out.println("""
                [1] Iniciar Sesion
                [2] Salir
                """);
        int userInput = scanner.nextInt();
        switch(userInput){
            case 1:
                Cliente c = validarUsuario();
                ClienteProxy proxy = new ClienteProxy(c);
                menu(proxy);
                break;
            case 2: counter = 0; break;
            default: System.out.println("Por favor insertar un valor valido");
        }
        }
    }

    public static void main(String[] args){
        RefugioDePerros refugioDePerros = new RefugioDePerros();
        Cliente c = new Cliente("Rodrigo13", "abecedario12", "55-8312-3233", "R03213");
        Cliente d = new Cliente("Alonso14", "astonm232", "55-3821-3113","FA1768");
        Cliente e = new Cliente("Israel32", "u24f2c0", "55-8249-3152","IA4436");
        refugioDePerros.baseDeClientes.put(c.getUsuario(), c);
        refugioDePerros.baseDeClientes.put(d.getUsuario(), d);
        refugioDePerros.baseDeClientes.put(e.getUsuario(), e);
        refugioDePerros.pantallaPrincipal();
    }
}
