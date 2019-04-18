import java.time.LocalTime;
public class WorldClock extends Clock {
    private int offset;
    public WorldClock(int loc) {
        super();
        offset = loc;
    }
    public int getHours(){
        int timeChange = super.getHours();
        timeChange = timeChange + offset;
        return timeChange;
    }
    public int getOffset(){
        return offset;
    }
}