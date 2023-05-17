public class Donativo {
    private String nombre;
    private String precio;
    private int identificador;

    public Donativo(String nombre, String precio, int identificador){
        this.nombre = nombre;
        this.precio = precio;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
