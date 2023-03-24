import java.util.Scanner;

public class Scanner_4{
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number between 0 and 1000");
		int number=input.nextInt();
		int product = 1;
		int lessThan10=1+(number-100)/100;
		int tens=(1+(number-10)/10)%10;
		int hundreds=number % 10;
		
		int sum = lessThan10*tens*hundreds;
		
        System.out.println("The multiplication of all digits is "+ sum);
	//Nur Sarah `Zzati
        //212642
        //Lab2
	}
	
	}
		
