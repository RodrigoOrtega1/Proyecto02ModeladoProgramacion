public class PerroView {
    /**
     * Muestra al usuario un perro con los siguientes atributos
     * @param nombre del perro
     * @param edad del perro
     * @param tamano del perro
     * @param raza del perro
     * @param descripcion del perro
     * @param enAdopcion del perro
     */
    public void printPerro(String nombre, int edad, String tamano, String raza, String descripcion, boolean enAdopcion){
        System.out.println("Detalles de " + nombre + ":");
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Tamano: " + tamano);
        System.out.println("Raza: " + raza);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Disponible para adopcion: " + enAdopcionFormato(enAdopcion));
    }

    /**
     * Para cambiar como se muestra el bool
     * @param bool bool a cambiar
     * @return string disponible si se puede adoptar
     */
    private String enAdopcionFormato(boolean bool){
        if(!bool){
           return "No disponible";
        }
        return "Disponible";
    }  
}
