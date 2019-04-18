import java.time.LocalTime;

public class Clock {
    private LocalTime time;
    public Clock(){
        time = LocalTime.now();
    }
    public int getHours(){
        return time.getHour();
    }
    public int getMinutes(){
        return time.getMinute();
    }
    public String getTime(){
        return time.toString();
    }
    
}