public class DonativoView {
    
    /**
     * Muesta al objeto donativo
     * @param nombre nombre del donativo
     * @param precio precio del donativo
     * @param identificador identificador del donativo
     */
    public void viewDonativo(String nombre, String precio, int identificador){
        System.out.println("Codigo: " + identificador);
        System.out.println("Donativo: " + nombre);
        System.out.println("Precio: " + precio + " pesos");
    }
}
