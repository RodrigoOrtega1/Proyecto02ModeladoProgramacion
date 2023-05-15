public class PastelCheems implements Pastel {
    private String descripcion;
    private int costo;
    public PastelCheems(){
        descripcion = "Harina de avena, pure de platano, huevo";
        costo = 1;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }    
}
