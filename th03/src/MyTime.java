public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    public MyTime(int hour, int minute, int second) throws IllegalAccessException {
        if(hour>12||minute>60||second>60){
            throw new IllegalAccessException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d",hour,minute,second);
    }
    public MyTime nextSecond(){
        second+=1;
        if(second==60){
            minute+=1;
            second=0;
        }
        if(minute==60){
            hour+=1;
            minute=0;
        }
        if(hour==25){
            hour=0;
            minute=0;
            second=0;
        }

        return this;
    }
    public MyTime nextMinute(){
        minute+=1;
        if(minute==60){
            hour+=1;
            minute=0;
        }
        if(hour==25){
            hour=0;
            minute=0;
            second=0;
        }

        return this;
    }
    public MyTime nextHour(){
        hour+=1;
        if(hour==25){
            hour=0;
            minute=0;
            second=0;
        }

        return this;
    }
    public MyTime previousSecond(){
        second-=1;
        if(second==-1){
            minute-=1;
            second=59;
        }
        if(minute==-1){
            hour-=1;
            minute=59;
        }
        if(hour==-1){
            hour=23;
            minute=59;
            second=59;
        }

        return this;
    }
    public MyTime previousMinute(){
        minute-=1;
        if(minute==-1){
            hour-=1;
            minute=59;
        }
        if(hour==-1){
            hour=23;
            minute=59;
            second=59;
        }

        return this;
    }
    public MyTime previousHour(){
        hour-=1;
        if(hour==-1){
            hour=23;
            minute=59;
            second=59;
        }

        return this;
    }


}
