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
    
    /**
     * Define el estado inicial del cliente.
     * @param usuario el usuario del cliente
     * @param contrasena la contrasena del cliente
     * @param telefono el numero de telefono del cliente
     * @param cuentaBancaria la cuenta bancaria asociada
     */
    public Cliente(String usuario, String contrasena, String telefono, String cuentaBancaria){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
    }
    
    /**
     * Metodo que devuelve el nombre de usuario del cliente
     * @return usuario el nombre de usuario del cliente
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Metodo que devuelve la contrasena del cliente
     * @return contrasena la contrasena del cliente
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Metodo que devuelve el telefono del cliente
     * @return telefono el telefono del cliente
     */
    public String getTelefono() {
        return telefono;
    }
    
    /**
     * Metodo que devuelve la cuenta bancaria del cliente
     * @return cuentaBancaria la cuenta bancaria del cliente
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    /**
     * Metodo setter para establecer el usuario del cliente
     * @param usuario el usuario del cliente
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * Metodo setter para establecer la contrasena del cliente
     * @param contrasena la contrasena del cliente
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Metodo setter para establecer el telefono del cliente
     * @param telefono el telefono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Metodo setter para establecer la cuenta bancaria del cliente
     * @param cuentaBancaria la cuenta bancaria del cliente
     */
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
