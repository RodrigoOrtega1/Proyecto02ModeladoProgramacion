public class ClienteProxy implements InterfazCliente{

    private Cliente clienteReal;

    public ClienteProxy(Cliente clienteReal){
        this.clienteReal = clienteReal;
    }

    @Override
    public String getUsuario() {
        return clienteReal.getUsuario(); //TODO: QUE MVC USE PROXY
    }
    
}
