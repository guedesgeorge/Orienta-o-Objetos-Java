package project06;

import project05.MSMMessenger;

public class ComputadorPedrinho {
  public static void main(String[] args) {
    servicoMensagemInstantanea smi = null;

    /*
     * NAO SE SABE QUAL APP
     * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
     */

     String appEscolhido="???";

     if(appEscolhido.equals("msn"))
     smi = new MSNMessenger();
     else if (appEscolhido.equals("fbm"))
     smi = new FacebookMessenger();
     else if (appEscolhido.equals("tlg"))
     smi = new Telegram();


     smi.enviarMensagem();
     smi.receberMensagem
     
  }
}
