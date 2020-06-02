package HotelReservations;

public class Date {

    private int startDay;
    private int endDay;

    public Date(int startDay, int endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public int getStartDay() {
        return startDay;
    }

    public int getEndDay() {
        return endDay;
    }
}
