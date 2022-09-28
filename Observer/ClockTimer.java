
public class ClockTimer extends Subject {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    };

    private void setHour(int i){
        hour += i;
    }

    private void setMinutes(int i){
        minute += i;
        if(minute-60==0){
            minute -= 60;
            setHour(1);
        }
    }

    public void setSeconds(int i){
        second += i/1000;
        if(second-60==0){
            second -= 60;
            setMinutes(1);
        }
    }

    public void tick(){
        while(true){
            setChanged();
            notifyObservers();

            try{
                Thread.sleep(1000);
                setSeconds(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
            if(hour >= 2){
                break;
            }
        }
    }
    } 
