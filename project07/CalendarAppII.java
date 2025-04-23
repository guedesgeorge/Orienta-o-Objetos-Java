package project07;

  import java.util.Calendar;

public class CalendarAppII {
  public static void main(String[] args) {


    Calendar agora = Calendar.getInstance();

  agora.add(Calendar.MONTH,1);

  // ou adiciona 30 dias corridos 
  // agora.add(Calendar.Day_OF_MOTH,30);

  // SET = definir valores 
  agora.set(Calendar.HOUR,0);
  agora.set(Calendar.MINUTE,0);
  agora.set(Calendar.SECOND,0);
  // São nescessario pois o tempo é muito especifico

  agora.set(Calendar.MILLISECOND, 0);
  agora.set(Calendar.AM_PM, Calendar.AM);

  // Obtém o ano, dia do mês e semana do mês respectivamente
  System.out.println(agora.get(Calendar.YEAR));
  System.out.println(agora.get(Calendar.DAY_OF_MONTH));
  System.out.println(agora.get(Calendar.WEEK_OF_YEAR));
}

  }
  