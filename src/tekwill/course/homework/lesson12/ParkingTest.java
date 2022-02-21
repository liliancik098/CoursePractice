package tekwill.course.homework.lesson12;

import java.time.LocalTime;

public class ParkingTest {
    public static void main(String[] args) {
        ParkingCharges client1 = new ParkingCharges();
        LocalTime parkingHours = LocalTime.of(23,0);
        client1.calculateCharges(parkingHours);
    }
}
