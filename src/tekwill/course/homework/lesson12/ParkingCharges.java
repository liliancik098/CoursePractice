package tekwill.course.homework.lesson12;

import java.time.LocalTime;

public class ParkingCharges {
    private double totalFeeForParking = 0.00;
    private double minTax = 2.00;
    LocalTime minHours = LocalTime.of(3, 0);

    private void setTotalFeeForParking(double totalFeeForParking) {
        this.totalFeeForParking = totalFeeForParking;
    }

    public void calculateCharges(LocalTime localTime) {
        if (localTime.compareTo(minHours) == 1) { // localTime > minHours
            int hours = localTime.getHour() - minHours.getHour();
            if (minTax + (hours * 0.5) >= 10){
                setTotalFeeForParking(10);
                System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
            } else {
                setTotalFeeForParking(minTax + (hours * 0.5));
                System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
            }
        } else if (localTime.compareTo(minHours) == -1 || localTime.compareTo(minHours) == 0) { //localtime <= minHours
            setTotalFeeForParking(minTax);
            System.out.println("You have to pay " + totalFeeForParking + "$ for " + localTime + " hours of parking");
        }
    }
}
