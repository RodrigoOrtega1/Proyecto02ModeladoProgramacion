public class Main {
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
