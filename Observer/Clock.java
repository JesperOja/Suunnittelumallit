

public class Clock {
    public static void main(String args[]){
        ClockTimer timer = new ClockTimer();

        DigitalClock digital = new DigitalClock(timer);

        timer.addObserver(digital);
        timer.tick();
    }
}
