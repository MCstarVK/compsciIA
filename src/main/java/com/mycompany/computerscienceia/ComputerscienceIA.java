
//TESTING THE CARBON FOOTPRINT FORMULAS BEFORE THE GUI 
package com.mycompany.computerscienceia;
import java.util.Scanner;

public class ComputerscienceIA {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your monthly electric bill: $");
        double electricBill = scanner.nextDouble();

        System.out.print("Enter your monthly gas bill: $");
        double gasBill = scanner.nextDouble();
    
        System.out.print("Enter your monthly oil bill: $");
        double oilBill = scanner.nextDouble();
        
        System.out.print("Enter your total yearly mileage on your car: ");
        double yearlyMileage = scanner.nextDouble();

        System.out.print("Enter the number of flights (4 hours or less) taken in the past year: ");
        int flightsShortDuration = scanner.nextInt();
        
        System.out.print("Enter the number of flights (4 hours or more) taken in the past year: ");
        int flightsLongDuration = scanner.nextInt();

        double electricResult = electricBill * 105;
        double gasResult = gasBill * 105;
        double oilResult = oilBill * 113;
        double mileageResult = yearlyMileage * 0.79;
        int flightsShortResult = flightsShortDuration * 1100;
        int flightsLongResult = flightsLongDuration * 4400;
        double totalCarbonFootprint = electricResult + gasResult + oilResult + mileageResult + flightsShortResult + flightsLongResult;

    
        System.out.println("\nResults:");
        System.out.println("Multiply your monthly electric bill by 105: $" + electricResult);
        System.out.println("Multiply your monthly gas bill by 105: $" + gasResult);
        System.out.println("Multiply your monthly oil bill by 113: $" + oilResult);
        System.out.println("Multiply your total yearly mileage on your car by 0.79: " + mileageResult + " miles");
        System.out.println("Multiply the number of flights you’ve taken in the past year (4 hours or less) by 1,100: " + flightsShortResult);
        System.out.println("Multiply the number of flights you’ve taken in the past year (4 hours or more) by 4,400: " + flightsLongResult);
        System.out.println("\nTotal Carbon Footprint: " + totalCarbonFootprint + " units");

        scanner.close();
    }
}