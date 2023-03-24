import java.util.Scanner;

public class Scanner_3 {
	public static void main(String[]args) {
		//Calculate of the retail price of the item being purchased
		Scanner input= new Scanner(System.in);
		System.out.print("retailPrice");
		double retail= input.nextDouble();
		System.out.print("salesTaxRate");
		double salesTaxRate= input.nextDouble();
		
		double salesTax=retail*salesTaxRate/100;
		double total= retail+salesTax;
		
		System.out.println("sale tax is"+String.format("%.2f",salesTax));
		System.out.println("Total="+String.format ("%.2f",total));
		//Nur Sarah `Zzati
        //212642
        //Lab2
		
		
		
		

		
	}

}
