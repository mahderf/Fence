package FencePackage;

import java.io.*;
import java.util.*;

public class CalculateCostofFence {
	// TODO Auto-generated method stub

	public static void main(String[] args) {
		int pwfpf = 25;
		int pcfpf = 15;
		int gatep =150;
		int permit =50;
		double tax ;
		double length =0;
		double width=0;
		double TotalPrice = 0;
		double price= 0;
		int gatenum =1;
		double area=0;
		double gatecst=0;
		double pron =0;
		double pron1=0;
		
		
		Scanner S = new Scanner(System.in); 
		System.out.println("what is the length of your fence?");// prompting and accepting length of fence
		length=S.nextInt(); 
		System.out.println("what is the width of your fence? ");// prompting and accepting width of fence
		width= S.nextInt(); 
		System.out.println("what type of fence do you need?");// prompting and accepting the type of fence
        String fenctype= S. next(); 
		System.out.println("how many gates do you need? ");// printing and accepting number of gates
        gatenum = S.nextInt();
        
      
        if (gatenum>1 && gatenum<3) // checks the number of gates is limited 1 to 3
        {
        area = length*width; // calculates the total area of the fence
        gatecst=gatep*gatenum; // calculates the total gate cost
	
		
  if (fenctype.equalsIgnoreCase("wooden")) // checks the choice of fence for this condition
	        
        {
      pron= area*pwfpf; // calculates the price for the total are and choice of fence
      price= pron+gatecst;
      System.out.println("price one" +pron);
         }
    
    if (fenctype.equalsIgnoreCase("chain")) // checks the choice of fence for this condition
      {
    pron1= area*pcfpf; // calculates the price for the total are and choice of fence
    price= pron1+gatecst;
    System.out.println("price one" +pron1);
       }
    
    tax = price *0.06;  // calculates 6% of the price
        TotalPrice= tax + permit + price; // Calculates the total price
    
		
		
	System.out.println("the total price for your fence is" + TotalPrice);
	}
        else {
        	System.out.println("you can only have 1 up to 3 gates");
        }
}
}
