import java.awt.Point;
public class Robot {
    Point robotLoc;
    int robotDir;
public Robot(Point startingLocation, int startingDirection)
{
    robotLoc = startingLocation;
    robotDir = startingDirection;
}//Note: 0 = North, 1 = East, 2 = South, 3 = West
public void turnLeft()
{
    robotDir = robotDir - 1;
}
public void turnRight()
{
    robotDir = robotDir + 1;
}
public void move()
{
    if (robotDir == 0){ // North
        robotLoc.y = robotLoc.y - 1;
    }
    if (robotDir == 1){ // East
        robotLoc.x = robotLoc.x + 1;
    }
    if (robotDir == 2){ // South
        robotLoc.y = robotLoc.y + 1;
    }
    if (robotDir == 3){ // West
        robotLoc.x = robotLoc.x - 1;
    }
}
public Point getLocation()
{
    return robotLoc;
}
public String getDirection()
{
    String dir = "";
    if (robotDir == 0){
        dir = "N";
    }
    if (robotDir == 1){
        dir = "E";
    }
    if (robotDir == 2){
        dir = "S";
    }
    if (robotDir == 3){
        dir = "W";
    }
    return dir;
}
}