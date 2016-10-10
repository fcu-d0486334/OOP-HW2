package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num;
		
		System.out.print("Enter a integer: ");
		num=scn.nextInt();
		
		switch(num){
		case 1:
			System.out.println("The input integer is \"ONE\".");
			break;
		case 2:
			System.out.println("The input integer is \"TWO\".");
			break;
		case 3:
			System.out.println("The input integer is \"THREE\".");
			break;
		case 4:
			System.out.println("The input integer is \"FOUR\".");
			break;
		case 5:
			System.out.println("The input integer is \"FIVE\".");
			break;
		case 6:
			System.out.println("The input integer is \"SIX\".");
			break;
		case 7:
			System.out.println("The input integer is \"SEVEN\".");
			break;
		case 8:
			System.out.println("The input integer is \"EIGHT\".");
			break;
		case 9:
			System.out.println("The input integer is \"NINE\".");
			break;
		default:
			System.out.println("The input integer is \"OTHER\".");
			break;
		}
	}
}
