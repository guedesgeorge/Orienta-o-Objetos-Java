package project06;

public abstract class ServicoMensagemInstantanea {

  public abstract void enviarMensagem();
  public abstract void receberMensagem();


  public abstract void salvarHistoricoMensagem();

  protected void validarConectadoInternet(){
    System.out.println("Validando se esta concetado a internet");
  }
}
