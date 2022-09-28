
import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer  {
    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }
    
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("Clock is " + hour + ":" +minute+":"+second);
    }


    @Override
    public void update(Observable o, Object arg) {
        
            draw();
        
        
    }
}