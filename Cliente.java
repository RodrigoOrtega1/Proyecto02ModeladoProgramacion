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
}
