package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int number;
		
		System.out.print("Enter a integer: ");
		number=scn.nextInt();
		
		if(number%2==0){
			System.out.println("The input integer is an Even Number.");
		}
		else{
			System.out.println("The input integer is an Odd Number.");
		}
	}
}
