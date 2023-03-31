//Nur Sarah `Zzati
//212642
//Lab 3 

import java.util.Scanner;
public class PrintReceipt {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		//Read 1st item from user
		System.out.print("Item 1:");
		String Item1 = input.nextLine();
		
		//Quantity of 1st item
		System.out.print("Quantity:");
		double quantity1 = input.nextDouble();
		
		//Price 1st item
		System.out.print("Unit Price:RM");
		double price1 = input.nextDouble();
		
		//Operation
		double amountItem1 = quantity1*price1;
		
		//Display the amount
		System.out.println("");
		System.out.println("Amount: RM "+String.format("%.2f",amountItem1));
		
		System.out.println("-----------------------");
		
		//Read 2nd item from user
		input.nextLine();
	    System.out.print("Item 2:");
		String Item2 = input.nextLine();
				
		//Quantity of 2nd item
		System.out.print("Quantity:");
		double quantity2 = input.nextDouble();
				
		//Price 2nd item
		System.out.print("Unit Price:RM");
		double price2 = input.nextDouble();
		
		//Operation
		double amountItem2 = quantity2*price2;
				
		//Display the amount
		System.out.println("");
		System.out.println("Amount: RM "+String.format("%.2f",amountItem2));
				
		//Operation
		double subtotal= amountItem1+amountItem2;
		double governmentTax= subtotal*0.06;
		double serviceCharge= subtotal*0.1;
		double total= subtotal+governmentTax+serviceCharge;
				
		//Display result
		System.out.println("");
		System.out.println("Subtotal: RM"+String.format("%.2f",subtotal));
		System.out.println("Government Tax(6%): RM"+String.format("%.2f", governmentTax));
		System.out.println("Service Charge(10%): RM"+String.format("%.2f",serviceCharge));
		System.out.println("Total: RM"+String.format("%.2f",total));
	
}
}
				
	
				
				
				
				
		
		
		

	


