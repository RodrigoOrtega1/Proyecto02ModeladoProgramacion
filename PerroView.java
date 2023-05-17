public class PerroView {
    public void printPerro(String nombre, int edad, String tamano, String raza, String descripcion, boolean enAdopcion){
        System.out.println("Detalles de " + nombre + ":");
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Tamano: " + tamano);
        System.out.println("Raza: " + raza);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Disponible para adopcion: " + enAdopcionFormato(enAdopcion));
    }

    private String enAdopcionFormato(boolean bool){
        if(!bool){
           return "No disponible";
        }
        return "Disponible";
    }  
}
