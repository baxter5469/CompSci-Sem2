/**
   A class to keep track of an appointment.
*/
public abstract class Appointment
{
   private String description;

   /**
      Constructs an appointment without a description.
   */
   public Appointment(String desc)
   {
      description = desc;
   }

   /**
      Sets the description of this appointment.
      @param description the text description of the appointment
   */
   public void setDescription(String description)
   {
      this.description = description;
   }

   /**
      Determines if this appointment occurs on the given date.
      @param year the year
      @param month the month
      @param day the day
      @return true if the appointment occurs on the given date.
   */
   public abstract boolean occursOn(int year, int month, int day);

   /**
      Converts appointment to string description.
   */
   public String toString()
   {
      return description;
   }
}
