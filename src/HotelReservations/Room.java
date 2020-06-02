package HotelReservations;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private List<Date> reservationDay=new ArrayList<>();

    public Room(int id) {
        this.id=id;
    }

    public List<Date> getReservationDay() {
        return reservationDay;
    }

    public boolean check(Date date) {
        if(reservationDay.isEmpty()) {
            return true;
        }
        for(Date resDay: reservationDay){
            if(!checkDateAvailable(date,resDay)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDateAvailable(Date newRes,Date oldRes) {
        return (newRes.getStartDay() < oldRes.getStartDay() && newRes.getStartDay() < oldRes.getEndDay() && newRes.getEndDay() < oldRes.getStartDay() && newRes.getEndDay() < oldRes.getEndDay())
                || (newRes.getStartDay() > oldRes.getStartDay() && newRes.getStartDay() > oldRes.getEndDay() && newRes.getEndDay() > oldRes.getStartDay() && newRes.getEndDay() > oldRes.getEndDay());
    }

    public int minDistance(Date date) {
        int min=365;
        int dis1,dis2;
        for(Date d: this.getReservationDay()) {
            dis1=Math.abs(date.getEndDay()-d.getStartDay());
            dis2=Math.abs(d.getEndDay()-date.getStartDay());
            if(min>dis1)
                min=dis1;
            if(min>dis2)
                min=dis2;
        }
        return min;
    }
}