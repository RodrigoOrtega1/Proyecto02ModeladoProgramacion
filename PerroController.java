public class PerroController {
    private Perro perro;
    private PerroView perroView;

    public PerroController(Perro perro, PerroView perroView) {
        this.perro = perro;
        this.perroView = perroView;
    }

    public String getNombre() {
        return perro.getNombre();
    }
    
    public int getEdad() {
        return perro.getEdad();
    }
    
    public String getTamano() {
        return perro.getTamano();
    }

    public String getRaza() {
        return perro.getRaza();
    }
    
    public String getDescripcion() {
        return perro.getDescripcion();
    }

    public boolean isEnAdopcion() {
        return perro.isEnAdopcion();
    }

    public void setNombre(String nombre) {
        perro.setNombre(nombre);
    }

    public void setEdad(int edad) {
        perro.setEdad(edad);
    }

    public void setTamano(String tamano) {
        perro.setTamano(tamano);
    }

    public void setRaza(String raza) {
        perro.setRaza(raza);
    }

    public void setDescripcion(String descripcion) {
        perro.setDescripcion(descripcion);
    }

    public void setEnAdopcion(boolean enAdopcion) {
        perro.setEnAdopcion(enAdopcion);
    }

    public void updatePerroView(){
        perroView.printPerro(getNombre(), getEdad(), getTamano(), getRaza(), getDescripcion(), isEnAdopcion());
    }
}