package tekwill.course.homework.lesson12;

import java.time.LocalTime;

public class ParkingCharges {
    private final double feeForThreeHoursParking = 2.00;
    private double totalFeeForParking = 0.00;
    private final double maximalFeeForParking = 10.0;
    LocalTime maximalHours = LocalTime.of(23, 59);
    LocalTime totalHoursParking = LocalTime.of(0, 0);

    private void setTotalFeeForParking(double totalFeeForParking) {
        this.totalFeeForParking = totalFeeForParking;
    }

    public void calculateCharges(LocalTime localTime) {
        LocalTime minHours = LocalTime.of(3, 0);
        totalHoursParking = LocalTime.of(maximalHours.getHour() - localTime.getHour(), maximalHours.getMinute() - localTime.getMinute());
        if (localTime.compareTo(minHours) == 1) { // localTime > minHours
            int hours = localTime.getHour() - minHours.getHour();
            if (3.00 + (hours * 0.5) >= 10){
                setTotalFeeForParking(10);
                System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
            } else {
                setTotalFeeForParking(3.00 + (hours * 0.5));
                System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
            }
        } else if (localTime.compareTo(minHours) == -1 || localTime.compareTo(minHours) == 0) { //localtime <= minHours
            setTotalFeeForParking(3.00);
            System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
        }
    }
}
