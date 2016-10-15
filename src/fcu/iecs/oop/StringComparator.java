package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s1,s2;
		boolean isEqual=false;
		while(!isEqual){
			System.out.print("Enter a string 1:");
			s1=scn.nextLine();
			
			System.out.print("Enter a string 2:");
			s2=scn.nextLine();
			
			if(s1.equalsIgnoreCase(s2)){
				System.out.println("The two lines are equal.");
				isEqual=true;
			}else{
				System.out.println("The two lines are not equal.");
				isEqual=false;
			}
		}
		scn.close();
	}
}
