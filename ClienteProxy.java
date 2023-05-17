public class ClienteProxy implements InterfazCliente{

    private Cliente clienteReal;

    public ClienteProxy(Cliente clienteReal){
        this.clienteReal = clienteReal;
    }

    @Override
    public String getContrasena() {
        return clienteReal.getContrasena();
    }

    @Override
    public String getTelefono() {
        return clienteReal.getTelefono();
    }

    @Override
    public String getCuentaBancaria() {
        return clienteReal.getCuentaBancaria();
    }

    @Override
    public void setContrasena(String contrasena) {
        clienteReal.setContrasena(contrasena);
    }

    @Override
    public void setTelefono(String telefono) {
        clienteReal.setTelefono(telefono);
    }

    @Override
    public void setCuentaBancaria(String cuentaBancaria) {
        clienteReal.setCuentaBancaria(cuentaBancaria);
    }
}
