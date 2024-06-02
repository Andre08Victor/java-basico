package apps;
public class MSNMessenger extends ServiçoMensagensInstataneas {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN.");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN.");
    }
}
   
