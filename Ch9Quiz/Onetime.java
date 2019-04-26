/**
   A onetime appointment.
*/
public class Onetime extends Appointment
{
	// instance variables
   private int oYear,oMonth,oDay;

   /**
      Constructor: Initializes appointment for a given date.
      @param year the year
      @param month the month
      @param day the day
      @param description the text description of the appointment
   */
   public Onetime(int year,int month,int day,String task){
      super(task);
      oYear = year;
      oMonth = month;
      oDay = day;
   }

   /**
      occursOn Method: Determines if this appointment occurs on the given date.
      @param year the year
      @param month the month
      @param day the day
      @return true if the appointment occurs on the given date.
   */
   public boolean occursOn(int year,int month,int day){
      if (year == oYear && month == oMonth && day == oDay){
         return true;
      }
      else{
         return false;
      }
   }
}
