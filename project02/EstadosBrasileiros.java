package project02;
public enum EstadosBrasileiros {

   SAO_PAULO  ("SP", "São Paulo"),
   RIO_JANIERO("RJ", "Rio de Janeiro"),
   MATO_GROSSO_SUL ("MS", "MATO GROSSO DO SUL"),
   MARANHAO ("MA", "MARANHÃO");

   private String nome;
   private String sigla;

   private EstadosBrasileiros(String sigla, String nome){
    this.sigla = sigla;
    this.nome = nome;
   }

   public String getSigla(){
    return sigla;

   }
   
   public String getNome(){
    return nome;

   }

   public String getNomeMaiusculo(){
    return nome.toUpperCase();
   }
}
