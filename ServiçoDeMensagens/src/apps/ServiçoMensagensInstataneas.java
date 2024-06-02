package apps;
public abstract class ServiçoMensagensInstataneas {
   
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando conexão à internet.");
    }

}
