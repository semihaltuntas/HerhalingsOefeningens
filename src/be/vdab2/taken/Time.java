package be.vdab2.taken;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        if (hours < 0) {
            throw new IllegalArgumentException("Invalid hours");
        }
        if (minutes < 0) {
            throw new IllegalArgumentException("Invalid minutes");
        }

        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this(hours,0);
    }

    public Time subtract(Time hour2){
        var hoursResult =  this.hours -hour2.hours ;
        var minutesResult = this.minutes - hour2.minutes;
        if (minutesResult < 0){
            hoursResult--;
            minutesResult+=60;
        }
        return new Time(hoursResult,minutesResult);
    }
    public Time add(Time hour2){
        var hoursResult = this.hours + hour2.hours;
        var minutesResult = this.minutes + hour2.minutes;
        if (minutesResult>59){
            hoursResult++;
            minutesResult-=60;
        }
        return new Time(hoursResult,minutesResult);
    }

    @Override
    public String toString() {
        return hours+ ":"+minutes;
    }

    public static void main(String[] args) {
        var hour1 = new Time(9,40);
        var hour2 = new Time(10,30);
        var hour3 = hour2.subtract(hour1);
        System.out.println(hour3);

        var hour4 = hour2.add(hour1);
        System.out.println(hour4);

        var hour5 =new Time(6);
    }
}
