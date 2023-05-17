public class Cliente implements InterfazCliente{
    /**
     * Nombre de un usuario
     */
    private String usuario;
    /**
     * Contrasena de un usuario
     */
    private String contrasena;
    /**
     * Telefono de un usuario
     */
    private String telefono;
    /**
     * Cuenta bancaria de un usuario
     */
    private String cuentaBancaria;
    
    public Cliente(String usuario, String contrasena, String telefono, String cuentaBancaria){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
