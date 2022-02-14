package com.bridgelabz.cabInvoice;

public class CalculateFareUC1 {
	    private static final int COST_PER_MIN = 1;
	    private static final double MINIMUM_FARE = 5.0;
	    private static final double COST_PER_KILO = 10.0;

	   
	    public double calculateFare(double distance, double time) {
	        double totalFare = (distance * COST_PER_KILO) + (time * COST_PER_MIN);
	        if (totalFare < MINIMUM_FARE) {
	            return MINIMUM_FARE;
	        }
	        return totalFare;
	    }

}
