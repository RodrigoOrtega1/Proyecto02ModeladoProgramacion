public class DonativoView {
    public void viewDonativo(String nombre, String precio, int identificador){
        System.out.println("Codigo: " + identificador);
        System.out.println("Donativo: " + nombre);
        System.out.println("Precio: " + precio + " pesos");
    }
}
