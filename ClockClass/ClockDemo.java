public class ClockDemo
{
  public static void main(String[] args)
  {
    Clock local = new Clock();
    WorldClock cali = new WorldClock(-3);
    System.out.printf("\nlocal.getHours(): %18s",local.getHours());
    System.out.printf("\nlocal.getMinutes(): %15s",local.getMinutes());
    System.out.printf("\nlocal.getTime(): %35s",local.getTime());
    System.out.printf("\ncali.getHours(): %18s",cali.getHours());
    System.out.printf("\ncali.getMinutes(): %16s",cali.getMinutes());
    System.out.printf("\ncali.getTime(): %36s",cali.getTime());
  }
}