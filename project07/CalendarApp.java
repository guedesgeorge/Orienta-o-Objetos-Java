package project07;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;;


public class CalendarApp {
  public static void main(String[] args) {
    // iniciando um formatador de datas
    DateFormat formatador = DateFormat.getDateInstance();
    // criando um objeto calendar
    Calendar calendario = Calendar.getInstance();
    // Obtendo o objeto date para ser formatado
    Date data = calendario.getTime();
    System.out.println("Formato original da data é: " + data);
    // Usando um formatador para exibir a data formatada
    String dataFormatada = formatador.format(data);
    System.out.println("A data formatada é: " + dataFormatada);

    /*
      Formato original da data é: Tue Feb 28 13:33:34 BRT 2023
      A data formatada é: 28 de fev. de 2023
    */
  }
}
