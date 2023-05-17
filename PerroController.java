public class PerroController {
    private Perro perro;
    private PerroView perroView;

    public PerroController(Perro perro, PerroView perroView) {
        this.perro = perro;
        this.perroView = perroView;
    }

    /**
     * Regresa el nombre del perro
     * @return nombre del perro
     */
    public String getNombre() {
        return perro.getNombre();
    }
    
    /**
     * Regresa la edad del perro
     * @return edad del perro
     */
    public int getEdad() {
        return perro.getEdad();
    }
    
    /**
     * Regresa el tamano del perro
     * @return tamano del perro
     */
    public String getTamano() {
        return perro.getTamano();
    }

    /**
     * Regresa la raza del perro
     * @return raza del perro
     */
    public String getRaza() {
        return perro.getRaza();
    }
    
    /**
     * Regresa la descripcion del perro
     * @return descripcion del perro
     */
    public String getDescripcion() {
        return perro.getDescripcion();
    }

    /**
     * Regresa si el perro esta en adopcion
     * @return si el perro esta en adopcion
     */
    public boolean isEnAdopcion() {
        return perro.isEnAdopcion();
    }

    /**
     * Cambia el nombre del perro
     * @param nombre nombre del perro
     */
    public void setNombre(String nombre) {
        perro.setNombre(nombre);
    }

    /**
     * Cambia la edad del perro
     * @param edad edad del perro
     */
    public void setEdad(int edad) {
        perro.setEdad(edad);
    }

    /**
     * Cambia el tamano del perro
     * @param tamano tamano del perro
     */
    public void setTamano(String tamano) {
        perro.setTamano(tamano);
    }
    
    /**
     * Cambia la raza del perro
     * @param raza raza del perro
     */
    public void setRaza(String raza) {
        perro.setRaza(raza);
    }

    /**
     * Cambia la descripcion del perro
     * @param descripcion descripcion del perro
     */
    public void setDescripcion(String descripcion) {
        perro.setDescripcion(descripcion);
    }

    /**
     * Cambia el estatus de adopcion del perro
     * @param enAdopcion si el perro se puede adoptar
     */
    public void setEnAdopcion(boolean enAdopcion) {
        perro.setEnAdopcion(enAdopcion);
    }

    /**
     * Manda a perrroView a que le muestre al usuario los perros con ciertos parametros
     */
    public void updatePerroView(){
        perroView.printPerro(getNombre(), getEdad(), getTamano(), getRaza(), getDescripcion(), isEnAdopcion());
    }
}