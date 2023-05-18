public class DonativoController {
    Donativo donativo;
    DonativoView donativoView;

    /**
     * Constructor definido del controlador de la clase donativo
     * @param donativo objeto donativo
     * @param donativoView objeto donativoView
     */
    public DonativoController(Donativo donativo, DonativoView donativoView){
        this.donativo = donativo;
        this.donativoView = donativoView;
    }

    /**
     * Regresa el nombre del objeto donativo
     * @return nombre del objeto donativo
     */
    public String getNombre() {
        return donativo.getNombre();
    }

    /**
     * Permite cambiar el nombre al objeto donativo
     * @param nombre nombre del objeto donativo
     */
    public void setNombre(String nombre) {
        donativo.setNombre(nombre);
    }

    /**
     * Regresa el precio del objeto donativo
     * @return precio del objeto donativo
     */
    public String getPrecio() {
        return donativo.getPrecio();
    }

    /**
     * Permite establecer el precio del objeto donativo
     * @param precio precio del objeto donativo
     */
    public void setPrecio(String precio) {
        donativo.setPrecio(precio);
    }

    /**
     * Regresa el identificador del objeto donativo
     * @return identificador del objeto donativo
     */
    public int getIdentificador() {
        return donativo.getIdentificador();
    }

    /**
     * Permite establecer el identificador del objeto donativo
     * @param identificador identificador del objeto donativo
     */
    public void setIdentificador(int identificador) {
        donativo.setIdentificador(identificador);
    }

    /**
     * Llama a donativoView para mostrar el objeto donativo con los parametros puestos
     */
    public void updateDonativoView(){
        donativoView.viewDonativo(getNombre(), getPrecio(), getIdentificador());
    }
}
