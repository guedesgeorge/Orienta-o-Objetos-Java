package project02;

public class EnumApp {
  public static void main(String[] args) {
    EstadosBrasileiros estadoLocalizado = EstadosBrasileiros.valueOf("RIO_JANEIRO");

    // Depois de obtero estado pelo seu identificador 
    // conseguimos explorar os sesu recursos 

    System.out.println(estadoLocalizado.getNome());
    System.out.println(estadoLocalizado.getSigla());
    System.out.println(estadoLocalizado.getNomeMaiusculo());
  }
}
