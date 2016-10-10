package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String string_1,string_2;
		System.out.print("Enter a string 1: ");
		string_1=scn.nextLine();
		
		System.out.print("Enter a string 2: ");
		string_2=scn.nextLine();

		if(string_1.compareToIgnoreCase(string_2)==0){
			System.out.println("The two strings are the same.");
		}
		else{
			System.out.println("The two strings are not the same.");
		}
	}
}
