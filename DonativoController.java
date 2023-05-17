public class DonativoController {
    Donativo donativo;
    DonativoView donativoView;

    public DonativoController(Donativo donativo, DonativoView donativoView){
        this.donativo = donativo;
        this.donativoView = donativoView;
    }

    public String getNombre() {
        return donativo.getNombre();
    }

    public void setNombre(String nombre) {
        donativo.setNombre(nombre);
    }

    public String getPrecio() {
        return donativo.getPrecio();
    }

    public void setPrecio(String precio) {
        donativo.setPrecio(precio);
    }

    public int getIdentificador() {
        return donativo.getIdentificador();
    }

    public void setIdentificador(int identificador) {
        donativo.setIdentificador(identificador);
    }

    public void updateDonativoView(){
        donativoView.viewDonativo(getNombre(), getPrecio(), getIdentificador());
    }
}
