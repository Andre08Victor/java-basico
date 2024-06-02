import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServiçoMensagensInstataneas;
import apps.Telegram;

public class ComputadorPedrinho {
    
    public static void main(String[] args) {
        
        ServiçoMensagensInstataneas smi = null;

        String appEscolhido = "fcb";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fcb")){
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }

}
