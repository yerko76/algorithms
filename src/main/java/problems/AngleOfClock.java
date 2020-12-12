package problems;

public class AngleOfClock {
    public static void main(String[] args){
        System.out.println(calculateAngle(3,0));
    }

    private static double calculateAngle(int hour, int minutes){
        double hour_angle = (360/(12 * 60.0)) * (hour * 60 + minutes);
        double minutes_angle = (360 / 60.0 * minutes);
        double angle = Math.abs(hour_angle - minutes_angle);
        return Math.min(angle, 360 - angle);
    }
    
}
