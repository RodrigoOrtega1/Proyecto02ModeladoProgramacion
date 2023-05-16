public class ClienteController {
    private Cliente cliente;
    private ClienteView clienteView;

    public ClienteController(Cliente cliente, ClienteView clienteView){
        this.cliente = cliente;
        this.clienteView = clienteView;
    }

    public String getUsuario() {
        return cliente.getUsuario();
    }
    public String getContrasena() {
        return cliente.getContrasena();
    }
    public String getTelefono() {
        return cliente.getTelefono();
    }
    public String getCuentaBancaria() {
        return cliente.getCuentaBancaria();
    }
    public void setUsuario(String usuario) {
        cliente.setUsuario(usuario);
    }
    public void setContrasena(String contrasena) {
        cliente.setContrasena(contrasena);
    }
    public void setTelefono(String telefono) {
        cliente.setTelefono(telefono);
    }
    public void setCuentaBancaria(String cuentaBancaria) {
        cliente.setCuentaBancaria(cuentaBancaria);
    }

    public void updateClienteView(){
        clienteView.printCliente(getUsuario(), getTelefono());
    }
}
