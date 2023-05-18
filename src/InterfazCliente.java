public interface InterfazCliente {
    /**
     * Regresa la contrasena del cliente
     * @return contrasena del cliente
     */
    String getContrasena();
    /**
     * Regresa el telefono del cliente
     * @return telefono del cliente
     */
    String getTelefono();
    /**
     * Regresa la cuenta bancaria del cliente
     * @return cuenta bancaria del cliente
     */
    String getCuentaBancaria();
    /**
     * Permite cambiar la contrasena del cliente
     * @param contrasena nueva contrasena del cliente
     */
    void setContrasena(String contrasena);
    /**
     * Permite cambiar el telefono del cliente
     * @param telefono telefono del cliente
     */
    void setTelefono(String telefono);

    /**
     * Permite cambiar la cuenta bancaria del cliente
     * @param cuentaBancaria cuenta bancaria del cliente
     */
    void setCuentaBancaria(String cuentaBancaria);
}
