package project05;

public class MSMMessenger {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando Mensagem");

    // Depois de enviada, salva o historico da mensagem
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem");
  }

  // métodos privadas, visiveis somente na classe
  private void validarConectadoInternet() {
    System.out.println("Validar se esta concetado a internet");
  }

  private void salvarHistoricoMensagem(){
    System.out.println("Salvando histrorico mensagem");
  }
}
