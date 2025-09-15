package org.example;

import java.util.Scanner;

public class OldCarPriceCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Car details: ");
        System.out.println("Enter show room price: ");
        double showRoomPrice = s.nextInt();
        System.out.println("Enter number of years used: ");
        int noOfYrsUsed = s.nextInt();
        double depreciatedValue;
        double amtTobePaidForCar;
        // Car depreciation calculation
        if(noOfYrsUsed == 1){
            depreciatedValue = 10*showRoomPrice/100;
        } else if (noOfYrsUsed == 2) {
            depreciatedValue = 20*showRoomPrice/100;
        } else if (noOfYrsUsed == 3) {
            depreciatedValue = 30*showRoomPrice/100;
        } else if (noOfYrsUsed == 4) {
            depreciatedValue = 50*showRoomPrice/100;
        } else{
            depreciatedValue = 60*showRoomPrice/100;
        }
        System.out.println("Showroom/Original price : " + showRoomPrice);
        System.out.println("Depreciated price: "+ depreciatedValue);
        amtTobePaidForCar = showRoomPrice-depreciatedValue;
        System.out.println("Amount to be paid (for 1 car): " + amtTobePaidForCar);
        System.out.println("Amount for 20 cars: "+ (20*amtTobePaidForCar));
    }
}