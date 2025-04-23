package project04;



public class FabricaCarro {
  public static void main(String[] args) {

    Carro carro1 = new Carro("Branca", "Jeep", "Compass");
    Carro carro2 = new Carro("Branca", "Jeep", "Compass");
    Carro carro3 = new Carro("Branca", "Jeep", "Compass");
    Carro carro4 = new Carro("Branca", "Jeep", "Compass");
    Carro carro5 = new Carro("Branca", "Jeep", "Compass");
    
    // case01
    System.out.println("carro1 == carro2");
    // case02 
    System.out.println(carro1.equals(carro2));
    System.out.println(carro1.equals(carro3));
    System.out.println(carro1.equals(carro4));
    System.out.println(carro1.equals(carro5));

    // case03

    Carro carro6 = carro1; // não é um novo carro, mas sim, uma referencia ao mesmo carro
    System.out.println(carro6 == carro1);
    System.out.println(carro6.equals(carro1));
  }
}
