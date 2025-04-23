package project02;

public class SistemIbge {
  public static void main(String [] args) {
    // Imprimindo dados existentes no enum
    for(EstadosBrasileiros uf: EstadosBrasileiros.values()) {
      System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
    }

    // selecionando um estado a partir das opcções disponíveis
    EstadosBrasileiros ufSelecionado = EstadosBrasileiros.MATO_GROSSO_SUL;

    System.out.println("O estado selecionado foi: " + ufSelecionado.getNome());
  }

}
