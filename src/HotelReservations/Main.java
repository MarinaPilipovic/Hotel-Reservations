package HotelReservations;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1a/1b
        Hotel hotel1=new Hotel(1);
        System.out.println("Hotel: size=1\n");

        System.out.print("Booking1: (-4,3)\t");
        Date date11=new Date(-4,3);
        hotel1.booking(date11);

        System.out.print("Booking2: (200,400)\t");
        Date date12=new Date(200,400);
        hotel1.booking(date12);


        System.out.println("----------------------------------");
        // 2
        Hotel hotel2=new Hotel(3);
        System.out.println("Hotel: size=3\n");

        System.out.print("Booking1: (0,5)\t\t");
        Date date21=new Date(0,5);
        hotel2.booking(date21);

        System.out.print("Booking2: (7,13)\t");
        Date date22=new Date(7,13);
        hotel2.booking(date22);

        System.out.print("Booking3: (3,9)\t\t");
        Date date23=new Date(3,9);
        hotel2.booking(date23);

        System.out.print("Booking4: (5,7)\t\t");
        Date date24=new Date(5,7);
        hotel2.booking(date24);

        System.out.print("Booking5: (6,6)\t\t");
        Date date25=new Date(6,6);
        hotel2.booking(date25);

        System.out.print("Booking6: (0,4)\t\t");
        Date date26=new Date(0,4);
        hotel2.booking(date26);

      
        System.out.println("----------------------------------");
        // 3
        Hotel hotel3=new Hotel(3);
        System.out.println("Hotel: size=3\n");

        System.out.print("Booking1: (1,3)\t\t");
        Date date31=new Date(1,3);
        hotel3.booking(date31);

        System.out.print("Booking2: (2,5)\t\t");
        Date date32=new Date(2,5);
        hotel3.booking(date32);

        System.out.print("Booking3: (1,9)\t\t");
        Date date33=new Date(1,9);
        hotel3.booking(date33);

        System.out.print("Booking4: (0,15)\t");
        Date date34=new Date(0,15);
        hotel3.booking(date34);


        System.out.println("----------------------------------");
        // 4
        Hotel hotel4=new Hotel(3);
        System.out.println("Hotel: size=3");

        System.out.print("Booking1: (1,3)\t\t");
        Date date41=new Date(1,3);
        hotel4.booking(date41);

        System.out.print("Booking2: (0,15)\t");
        Date date42=new Date(0,15);
        hotel4.booking(date42);

        System.out.print("Booking3: (1,9)\t\t");
        Date date43=new Date(1,9);
        hotel4.booking(date43);

        System.out.print("Booking4: (2,5)\t\t");
        Date date44=new Date(2,5);
        hotel4.booking(date44);

        System.out.print("Booking5: (4,9)\t\t");
        Date date45=new Date(4,9);
        hotel4.booking(date45);

        System.out.println("----------------------------------");
        // 5
        Hotel hotel5=new Hotel(2);
        System.out.println("Hotel: size=2");

        System.out.print("Booking1: (1,3)\t\t");
        Date date51=new Date(1,3);
        hotel5.booking(date51);

        System.out.print("Booking2: (0,4)\t\t");
        Date date52=new Date(0,4);
        hotel5.booking(date52);

        System.out.print("Booking3: (2,3)\t\t");
        Date date53=new Date(2,3);
        hotel5.booking(date53);

        System.out.print("Booking4: (5,5)\t\t");
        Date date54=new Date(5,5);
        hotel5.booking(date54);

        System.out.print("Booking5: (4,10)\t");
        Date date55=new Date(4,10);
        hotel5.booking(date55);

        System.out.print("Booking6: (10,10)\t");
        Date date56=new Date(10,10);
        hotel5.booking(date56);

        System.out.print("Booking7: (6,7)\t\t");
        Date date57=new Date(6,7);
        hotel5.booking(date57);

        System.out.print("Booking8: (8,10)\t");
        Date date58=new Date(8,10);
        hotel5.booking(date58);

        System.out.print("Booking9: (8,9)\t\t");
        Date date59=new Date(8,9);
        hotel5.booking(date59);
    }
}
