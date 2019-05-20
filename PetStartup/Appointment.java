import java.util.Calendar;

public class Appointment
{
  private Calendar appointmentTime;
  public Appointment(int year, int month, int day, int hour, int minute){
    appointmentTime.set(year,month,day,hour,minute);
  }
}