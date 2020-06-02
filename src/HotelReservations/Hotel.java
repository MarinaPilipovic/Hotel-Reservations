package HotelReservations;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private static final String DECLINED = "Declined";
    private static final String ACCEPT = "Accept";
    private int size;
    private List<Room> rooms=new ArrayList<>();


    public Hotel(int size) throws Exception {
        if (size > 1000) {
            throw new Exception(DECLINED);
        }
        this.size = size;
        for(int i=0;i<size;i++) {
            rooms.add(new Room(i));
        }
    }

    public void booking(Date reservation) {
        if (reservation.getStartDay() < 0 || reservation.getStartDay() > 365 || reservation.getEndDay() < 0 || reservation.getEndDay() > 365) {
            System.out.println(DECLINED);
            return;
        }

        int minDistance = minDis(reservation);
        for (Room r : getRooms()) {
            if(r.check(reservation)) {
                if (r.minDistance(reservation) == minDistance) {
                    r.getReservationDay().add(reservation);
                    System.out.println(ACCEPT);
                    return;
                }
            }
        }
        System.out.println(DECLINED);
    }


    public List<Room> getRooms() {
        if (rooms == null)
            rooms = new ArrayList<Room>();
        return rooms;
    }

    public int minDis(Date res) {
        int min=365;
        for(Room room: getRooms()) {
            if(room.check(res)){
                if(min>room.minDistance(res))
                    min=room.minDistance(res);
            }
        }
        return min;
    }
}
